package com.gxytestserver.service;

import java.util.List;

import com.gxytestserver.entity.User;

public interface UserService {
    public List<User> queryAll();

    public User queryByIdNumber(String idNumber);

    public List<User> queryByName(String name);
}
