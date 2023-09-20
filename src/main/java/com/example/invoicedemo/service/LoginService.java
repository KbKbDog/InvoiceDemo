package com.example.invoicedemo.service;

import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.domain.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
