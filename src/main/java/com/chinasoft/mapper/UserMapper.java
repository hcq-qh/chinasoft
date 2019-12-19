package com.chinasoft.mapper;

import com.chinasoft.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User selectByUserName(String name);
}
