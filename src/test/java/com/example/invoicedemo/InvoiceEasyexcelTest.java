package com.example.invoicedemo;

import ch.qos.logback.core.property.FileExistsPropertyDefiner;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.util.MapUtils;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.example.invoicedemo.domain.Invoice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class InvoiceEasyexcelTest {


    /**
     * 复杂的填充
     *
     * @since 2.1.1
     */
    @Test
    public void complexFill() {
        // 模板注意 用{} 来表示你要用的变量 如果本来就有"{","}" 特殊字符 用"\{","\}"代替
        // {} 代表普通变量 {.} 代表是list的变量
        FileExistsPropertyDefiner TestFileUtil = new FileExistsPropertyDefiner();
        TestFileUtil.setPath("C:\\Users\\10515\\Documents");
        String templateFileName =
                TestFileUtil.getPath() + File.separator + "市内交通费-模板2.xlsx";

        String fileName = TestFileUtil.getPath() + File.separator+ "市内交通费.xlsx";

        Invoice invoice =new Invoice();
        invoice.setId(1);
        invoice.setBoardingDate(LocalDate.of(2023,12,07));
        List<Invoice> invoiceList=new ArrayList<Invoice>();
        invoiceList.add(invoice);
        invoice =new Invoice();
        invoice.setId(2);
        invoice.setBoardingDate(LocalDate.of(2024,11,19));
        invoiceList.add(invoice);

        // 方案1
        try (ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet().build();
            // 这里注意 入参用了forceNewRow 代表在写入list的时候不管list下面有没有空行 都会创建一行，然后下面的数据往后移动。默认 是false，会直接使用下一行，如果没有则创建。
            // forceNewRow 如果设置了true,有个缺点 就是他会把所有的数据都放到内存了，所以慎用
            // 简单的说 如果你的模板有list,且list不是最后一行，下面还有数据需要填充 就必须设置 forceNewRow=true 但是这个就会把所有数据放到内存 会很耗内存
            // 如果数据量大 list不是最后一行 参照下一个
            FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.FALSE).build();
            excelWriter.fill(invoiceList,fillConfig, writeSheet);
        }
    }
}
