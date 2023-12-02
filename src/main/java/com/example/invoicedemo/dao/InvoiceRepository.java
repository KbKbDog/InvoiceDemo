package com.example.invoicedemo.dao;

import com.example.invoicedemo.domain.Invoice;
import com.example.invoicedemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {



}

