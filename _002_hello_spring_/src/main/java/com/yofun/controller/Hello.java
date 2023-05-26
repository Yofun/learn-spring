package com.yofun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    String hello = "Hello spring~";

    @GetMapping("/hello")
    public String hello() {
        System.out.println(this.hello);
        return this.hello;
    }
}
