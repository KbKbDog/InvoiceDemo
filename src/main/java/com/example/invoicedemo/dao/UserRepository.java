package com.example.invoicedemo.dao;

import com.example.invoicedemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select s from User s where s.userName = ?1 and s.password = ?2")
    List<User> findUserByUserNameAndPassword(String userName,String password);

    @Query("select s from User s where s.userName = ?1")
    List<User> findUserByUserName(String userName);
    
}

