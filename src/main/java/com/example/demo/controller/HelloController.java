package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 加上这个注解才能处理http请求
@Tag(name = "Hello控制器")
@RestController
public class HelloController {
    // 配置url映射，当访问serverAddress/hello时返回以下数据
    @GetMapping("/hello")
    @Operation(summary = "Hello Spring Boot")
    public String hello() {
        return "Hello World Spring Boot";
    }
}
