package com.example.invoicedemo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="invoice_list")
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    /**
     * 主键
     */
    @Id
    private int id;
    /**
     * 乘车日期
     */
    @Column(name = "boarding_date")
    private LocalDate boardingDate;
    /**
     * 上车时间
     */
    @Column(name = "boarding_time")
    private LocalDateTime nickName;
    /**
     * 下车时间
     */
    @Column(name = "disembarking_time")
    private LocalDateTime disembarkingTime;
    /**
     * 乘车人
     */
    @Column
    private String passenger;
    /**
     * 起点
     */
    @Column(name = "starting_points")
    private String startingPoints;
    /**
     * 终点
     */
    @Column(name = "ending_points")
    private String endingPoints;
    /**
     * 报销金额
     */
    @Column(name = "reimbursemen_amount")
    private BigDecimal reimbursemenAmount;
    /**
     * 是否电子发票
     */
    @Column(name = "electronic_invoice_flg")
    private String electronicInvoiceFlg;
    /**
     * 电子发票税额
     */
    @Column(name = "electronic_invoice_tax_amount")
    private BigDecimal electronicInvoiceTaxAmount;
    /**
     * 项目编号
     */
    @Column(name = "project_no")
    private String projectNo;
    /**
     * 任务名称
     */
    @Column(name = "task_name")
    private String taskName;
    /**
     * 情况说明
     */
    @Column(name = "situation_description")
    private String situationDescription;

}
