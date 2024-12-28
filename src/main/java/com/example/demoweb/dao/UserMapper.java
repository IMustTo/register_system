package com.example.demoweb.dao;

import com.example.demoweb.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User user);
    User selectByUserName(String userName);
} 