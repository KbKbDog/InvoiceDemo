package com.example.invoicedemo.dao;

import com.example.invoicedemo.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {


}

