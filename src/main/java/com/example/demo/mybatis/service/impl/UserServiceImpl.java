package com.example.demo.mybatis.service.impl;

import com.example.demo.mybatis.entity.User;
import com.example.demo.mybatis.mapper.UserMapper;
import com.example.demo.mybatis.service.UserService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("/userService")
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByUsername(String username){
        return userMapper.findByUsername(username);
    }

    @Override
    public int findIDByName(String username){
        return userMapper.findByUsername(username).getId();
    }

    @Override
    public List<User> findFollowers(int id){
        int[] a = userMapper.findFollowers(id);
        List<User> followers=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            User user = userMapper.findById(a[i]);
            followers.add(user);
        }
        return followers;
    }

    @Override
    public List<User> findFollowings(int id){
        int[] a = userMapper.findFollowings(id);
        List<User> followers=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            User user = userMapper.findById(a[i]);
            followers.add(user);
        }
        return followers;
    }
}
