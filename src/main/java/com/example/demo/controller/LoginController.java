package com.example.demo.controller;

import com.example.demo.entity.DUser;
import com.example.demo.service.LoginService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name= "登录控制器")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    @Operation(description = "登录")
    public DUser login(String username, String password) {
        return loginService.login(username, password);
    }

}
