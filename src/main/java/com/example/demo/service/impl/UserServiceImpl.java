package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public void addUser(User user) {
         userMapper.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
        userMapper.delUser(id);
    }

    @Override
    public User findUserbyId(Integer id) {
        return userMapper.findUserbyId(id);
    }

    @Override
    public User findUserbyUsername(String username) {
        return userMapper.findUserbyUsername(username);
    }


    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }


    @Override
    public User selectUserbyId(Integer id) {
        return userMapper.selectUserbyId(id);
    }
}
