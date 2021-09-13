package com.study.omega.omega.controller;

import com.study.omega.omega.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestTestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/user")
    public User user(){

        User user = User.builder()
            .email("spammy7147@gmail.com")
            .name("spammy")
            .build();

        return user;
    }
}
