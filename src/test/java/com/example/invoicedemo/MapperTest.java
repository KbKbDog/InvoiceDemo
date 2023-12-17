package com.example.invoicedemo;

import com.example.invoicedemo.dao.UserRepository;
import com.example.invoicedemo.domain.User;
import com.example.invoicedemo.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void TestBCryptPasswordEncoder(){
        BCryptPasswordEncoder passwordEncoder =new BCryptPasswordEncoder();
        String encode=passwordEncoder.encode("root");
        try {
            Claims claims = JwtUtil.parseJWT(encode);
            System.out.println(claims.getSubject());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("token非法");
        }
        System.out.println(encode);
    }
    @Test
    public void testUserMaper(){
        List<User> users=userRepository.findAll();
        System.out.println(users);
    }


}
