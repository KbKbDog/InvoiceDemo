package com.example.invoicedemo.service.impl;

import com.example.invoicedemo.dao.UserRepository;
import com.example.invoicedemo.domain.LoginUser;
import com.example.invoicedemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //查询用户信息
        List<User> users=userRepository.findUserByUserName(username);
        if(users.isEmpty()){
            //如果查询不到数据就通过抛出异常来给出提示
            throw new RuntimeException("用户名或密码错误");
        }

        //TODO：查询对应权限

        //封装成UserDetails返回
        return new LoginUser(users.get(0));
    }
}
