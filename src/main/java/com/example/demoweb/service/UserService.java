package com.example.demoweb.service;

import com.example.demoweb.dto.UserRegisterDTO;
import com.example.demoweb.entity.User;

public interface UserService {
    User register(UserRegisterDTO registerDTO);
} 