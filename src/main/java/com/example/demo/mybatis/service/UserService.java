package com.example.demo.mybatis.service;

import com.example.demo.mybatis.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findByUsername(String username);
    int findIDByName(String username);
    List<User> findFollowers(int id);
    List<User> findFollowings(int id);
}
