package com.example;

import com.example.model.Student;
import com.example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 请求参数对象实例接受
@RestController
public class _02 {
    @GetMapping("/02/get")
    public String get(User user) {
        System.out.println(user);
        return "ok";
    }

    @PostMapping("/02/post")
    public String post(Student student) {
        System.out.println(student);
        return "ok";
    }
}
