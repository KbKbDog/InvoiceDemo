package com.example.invoicedemo.service.impl;


import ch.qos.logback.core.property.FileExistsPropertyDefiner;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.example.invoicedemo.dao.InvoiceRepository;
import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.service.InvoiceService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

@Service
public class InvoiceServieImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public ResponseResult addList(Invoice invoice) {

        invoiceRepository.save(invoice);
        return null;
    }

    @Override
    public ResponseResult download(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        FileExistsPropertyDefiner TestFileUtil = new FileExistsPropertyDefiner();
        TestFileUtil.setPath("C:\\Users\\10515\\Documents");
        String fileName = TestFileUtil.getPath() + File.separator + "市内交通费.xlsx";
        String fileNameEncode = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");

        List<Invoice> invoiceList = invoiceRepository.findAll();

        //模板文件路径
        String templateFileName =
                TestFileUtil.getPath() + File.separator + "市内交通费-模板2.xlsx";

        try (ExcelWriter excelWriter = EasyExcel.write(fileName).withTemplate(templateFileName).build()) {
            WriteSheet writeSheet = EasyExcel.writerSheet().build();
            FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.FALSE).build();
            excelWriter.fill(invoiceList, fillConfig, writeSheet);
        }
        return new ResponseResult(200, "下载成功");
    }
}
