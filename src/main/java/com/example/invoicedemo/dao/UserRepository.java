package com.example.invoicedemo.dao;

import com.example.invoicedemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    
}

