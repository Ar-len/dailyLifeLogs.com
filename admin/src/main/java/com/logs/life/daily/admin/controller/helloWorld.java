package com.logs.life.daily.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs/")
public class helloWorld {

    @GetMapping("hello")
    public String hello(){
        return "hello world2!";
    }
}
