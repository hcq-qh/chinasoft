package com.chinasoft.service;

import com.chinasoft.entity.User;

public interface UserService {
    public User selectByUserName(String name);
}
