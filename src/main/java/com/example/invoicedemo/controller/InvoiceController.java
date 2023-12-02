package com.example.invoicedemo.controller;

import com.example.invoicedemo.dao.InvoiceRepository;
import com.example.invoicedemo.dao.UserRepository;
import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.User;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceController {

    @Resource
    private InvoiceRepository invoiceRepository;

    @PostMapping("/getList")
    public List<Invoice> getList(){
        return invoiceRepository.findAll();
    }
}

