package com.example.invoicedemo.service.impl;

import com.example.invoicedemo.domain.LoginUser;
import com.example.invoicedemo.domain.ResponseResult;
import com.example.invoicedemo.domain.User;
import com.example.invoicedemo.service.LoginService;
import com.example.invoicedemo.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public ResponseResult login(User user) {
        //用户认证
        UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());
        Authentication authenticate= authenticationManager.authenticate(authenticationToken);
        //认证没通过，返回提示
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("登录失败");
        }
        //认证通过了，生成jwt返回
        LoginUser loginUser=(LoginUser) authenticate.getPrincipal();
        String userid=loginUser.getUser().getId().toString();
        String jwt= JwtUtil.createJWT(userid);
        Map<String,String> map=new HashMap<>();
        map.put("token",jwt);

        //用户信息存储？（不要）

        return new ResponseResult(200,"登录成功",map);
    }

    @Override
    public ResponseResult logout() {
        Map<String,String> map=new HashMap<>();
        map.put("token","1");

        //返回假
        return new ResponseResult(200,"登录成功",map);
    }
}
