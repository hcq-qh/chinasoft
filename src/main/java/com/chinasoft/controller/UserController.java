package com.chinasoft.controller;

import com.chinasoft.entity.User;
import com.chinasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public User find(){
        return userService.selectByUserName("aaa");
    }
}
