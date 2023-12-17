package com.example.invoicedemo.controller;

import com.example.invoicedemo.dao.InvoiceRepository;
import com.example.invoicedemo.dao.UserRepository;
import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.domain.User;
import com.example.invoicedemo.service.InvoiceService;
import jakarta.annotation.Generated;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    @Resource
    private InvoiceRepository invoiceRepository;

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/getList")
    public ResponseResult getList(){
        return new ResponseResult(200,invoiceRepository.findAll());
    }

    @GetMapping("/addList")
    public ResponseResult addList(@RequestBody Invoice invoice){
        return invoiceService.addList(invoice);
    }
}

