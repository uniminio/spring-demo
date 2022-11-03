package com.example.demo.service;

import com.example.demo.entity.DUser;

public interface LoginService {
    DUser login(String username, String password);
}
