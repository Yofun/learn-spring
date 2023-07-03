package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 普通请求参数
@RestController
public class _01 {
    @GetMapping("/01/get")
    public String get(String name, int age) {
        System.out.println(name + ":::" + age);
        return "ok";
    }

    @PostMapping("/01/post")
    public String post(@RequestParam(value = "name", required = false) String username, @RequestParam(value = "password", required = true) String password) {
        System.out.println(username + ":::" + password);
        return "ok";
    }
}
