package com.example.demoweb.service.impl;

import com.example.demoweb.dao.UserMapper;
import com.example.demoweb.dto.UserRegisterDTO;
import com.example.demoweb.entity.User;
import com.example.demoweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User register(UserRegisterDTO registerDTO) {
        // 检查用户名是否已存在
        User existingUser = userMapper.selectByUserName(registerDTO.getUserName());
        if (existingUser != null) {
            throw new RuntimeException("用户名已存在");
        }

        // 创建新用户
        User user = new User();
        user.setUserName(registerDTO.getUserName());
        user.setPassword(registerDTO.getPassword());
        user.setGender(registerDTO.getGender());
        user.setAge(registerDTO.getAge());
        user.setEmailAddress(registerDTO.getEmailAdddress());
        user.setCreateTime(LocalDateTime.now());

        // 保存用户
        userMapper.insert(user);
        return user;
    }
} 