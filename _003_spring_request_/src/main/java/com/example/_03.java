package com.example;

import com.example.model.Student;
import com.example.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
// 请求参数数组接受
@RestController
public class _03 {
    @GetMapping("/03")
    public String get(String[] list) {
        System.out.println(Arrays.toString(list));
        return "ok";
    }

    @PostMapping("/03")
    public String post(@RequestParam(value = "names",required = true) String[] usernames) {
        System.out.println(Arrays.toString(usernames));
        return "ok";
    }

    @PatchMapping("/03")
    public String patch(User user)  {
        System.out.println(user);
        return "ok";
    }

    /**
     * 注解 RequestParam 是必须的
     * @param usernames
     * @return
     */
    @PostMapping("/03/list")
    public String list(@RequestParam(value = "names",required = true)List<String> usernames) {
        System.out.println(Arrays.toString(usernames.toArray()));
        return "ok";
    }
}
