package com.gxytestserver.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gxytestserver.entity.User;
import com.gxytestserver.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Autowired
    private UserService userService;

    @Test
    public void testHello() {
        assertEquals(userController.hello(), "hello");
    } 

    @Test
    public void testQueryByName() {
        List<User> list = userService.queryByName("Tom");
        if (list.size() > 0) {
            for (User user : list) {
                assertEquals(user.getName(), "Tom");
            }
        }
    } 
}
