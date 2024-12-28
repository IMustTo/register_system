package com.example.demoweb.dto;

public class UserRegisterDTO {
    private String userName;
    private String password;
    private String gender;
    private Integer age;
    private String emailAdddress;

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmailAdddress() {
        return emailAdddress;
    }

    public void setEmailAdddress(String emailAdddress) {
        this.emailAdddress = emailAdddress;
    }
} 