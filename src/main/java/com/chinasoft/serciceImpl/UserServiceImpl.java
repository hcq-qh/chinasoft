package com.chinasoft.serciceImpl;

import com.chinasoft.entity.User;
import com.chinasoft.mapper.UserMapper;
import com.chinasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUserName(String name) {
        return userMapper.selectByUserName(name);
    }
}
