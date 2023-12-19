package com.example.invoicedemo.service;

import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.ResponseResult;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface InvoiceService {
    ResponseResult addList(Invoice invoice);

    ResponseResult download(HttpServletResponse response) throws IOException;
}
