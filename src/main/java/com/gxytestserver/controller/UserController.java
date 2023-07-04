package com.gxytestserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gxytestserver.entity.User;
import com.gxytestserver.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private Gson gson;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/queryAll")
    public String queryAll() {
        List<User> list = userService.queryAll();
        return list == null ? "null" : gson.toJson(list);
    }

    @RequestMapping("/queryByIdNumber")
    public String queryByIdNumber(@RequestParam String id) {
        User user = userService.queryByIdNumber(id);
        return user == null ? "null" : gson.toJson(user);
    }

    @RequestMapping("/queryByName")
    public String queryByName(@RequestParam String name) {
        List<User> list = userService.queryByName(name);
        return list == null ? "null" : gson.toJson(list);
    }
}
