package com.example.invoicedemo.service.impl;


import com.example.invoicedemo.dao.InvoiceRepository;
import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServieImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;
    @Override
    public ResponseResult addList(Invoice invoice) {

        invoiceRepository.save(invoice);
        return null;
    }
}
