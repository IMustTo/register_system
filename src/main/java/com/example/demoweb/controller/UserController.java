package com.example.demoweb.controller;

import com.example.demoweb.common.Result;
import com.example.demoweb.dto.UserRegisterDTO;
import com.example.demoweb.entity.User;
import com.example.demoweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result<User> register(@RequestBody UserRegisterDTO registerDTO) {
        try {
            User user = userService.register(registerDTO);
            return Result.success(user);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }
} 