package com.example.security.inmemorydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping("/test")
    public String sayHelloFromTest(){
        return "Hello from /test method";
    }

    @GetMapping("/user")
    public String sayHelloFromUser(){
        return "Hello from USER";
    }

    @GetMapping("/admin")
    public String sayHelloFromAdmin(){
        return "Hello from ADMIN";
    }
}

