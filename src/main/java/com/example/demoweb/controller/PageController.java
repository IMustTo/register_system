package com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/register.html")
    public String register() {
        return "register";
    }

    @GetMapping("/success.html")
    public String success() {
        return "success";
    }

    @GetMapping("/error.html")
    public String error() {
        return "error";
    }
} 