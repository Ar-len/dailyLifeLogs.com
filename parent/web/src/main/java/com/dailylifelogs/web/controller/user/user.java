package com.dailylifelogs.web.controller.user;

import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import com.dailylifelogs.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logs/")
public class user {

    @Autowired
    UserService userService;
    @GetMapping("hello")
    public String hello(){
        return "hllo";
    }
    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("user")
    List<User> selectByExample(UserExample userExample){
        UserExample userExample1=new UserExample();
        userExample.setLimit(11);
        return userService.selectByExample(userExample1);
    }
}
