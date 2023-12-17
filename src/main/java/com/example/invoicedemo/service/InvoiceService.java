package com.example.invoicedemo.service;

import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.domain.User;

public interface InvoiceService {
    ResponseResult addList(Invoice invoice);

}
