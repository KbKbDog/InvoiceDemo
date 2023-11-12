package com.example.invoicedemo.controller;

import com.example.invoicedemo.dao.UserRepository;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.domain.User;
import com.example.invoicedemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    UserRepository userRepository;
    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        //登录
       return loginService.login(user);
    }

    @PostMapping("/user/logout")
    public ResponseResult logiout(){
        //登录
        return loginService.logout();
    }
}
