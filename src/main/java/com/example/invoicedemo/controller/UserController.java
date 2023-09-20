package com.example.invoicedemo.controller;

import com.example.invoicedemo.dao.UserRepository;
import com.example.invoicedemo.domain.User;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    public List<User> getUser(){
        return userRepository.findAll();
    }
}

