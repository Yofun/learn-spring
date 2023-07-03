package com.yofun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单参数接收
 */
@RestController
public class _002 {

    /**
     * 1 get 接口接收参数
     */
    @GetMapping("/02/get")
    public String get(String name, int age) {
        System.out.println(name+":::"+age);
        return "get ok";
    }

    /**
     * 2. post 接口接收参数
     */
    @PostMapping("/02/post")
    public String post(String name, int age) {
        System.out.println(name+":::"+age);
        return "post ok";
    }

    /**
     * 3. 修改接收参数的名字
     */
    @PostMapping("/02/post2")
    public String post2(@RequestParam(value = "name", required = false) String username, int age) {
        System.out.println(username+":::"+age);
        return "post ok";
    }
}
