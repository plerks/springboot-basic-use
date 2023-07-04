package com.gxytestserver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxytestserver.entity.User;
import com.gxytestserver.mapper.UserMapper;
import com.gxytestserver.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    public User queryByIdNumber(String idNumber) {
        return userMapper.queryByIdNumber(idNumber);
    }

    public List<User> queryByName(String name) {
        return userMapper.queryByName(name);
    }
}
