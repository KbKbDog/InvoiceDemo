package com.example.invoicedemo.controller;

import com.example.invoicedemo.dao.InvoiceRepository;
import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.service.InvoiceService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class InvoiceController {

    @Resource
    private InvoiceRepository invoiceRepository;

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/getList")
    public ResponseResult getList() {
        return new ResponseResult(200, invoiceRepository.findAll());
    }

    @GetMapping("/addList")
    public ResponseResult addList(@RequestBody Invoice invoice) {
        return invoiceService.addList(invoice);
    }

    @GetMapping("/download")
    public ResponseResult download(HttpServletResponse response) throws IOException {
        return invoiceService.download(response);
    }

}

