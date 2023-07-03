package com.example;

import com.example.model.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
// 请求参数指定时间接受
@RestController
public class _04 {
    @GetMapping("/04")
    public String date(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime time)  {
        System.out.println(time);
        return "ok";
    }
}
