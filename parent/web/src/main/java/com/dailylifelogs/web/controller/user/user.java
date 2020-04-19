package com.dailylifelogs.web.controller.user;

import ajaxResponse.AjaxResponse;
import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import com.dailylifelogs.web.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class user {

    @Autowired
    UserService userService;

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("users")
    public @ResponseBody AjaxResponse selectByExample(){
        UserExample userExample=new UserExample();
        userExample.setLimit(11);http://localhost:8888/logs/users
        return AjaxResponse.success(userService.selectByExample(userExample));
    }

    @PostMapping("users")
    public @ResponseBody AjaxResponse insertUser(@RequestBody User user){
        return AjaxResponse.success(userService.insertSelective(user));
    }

    @PutMapping("users/{id}")
    public @ResponseBody AjaxResponse updateUser(@PathVariable String id,@RequestBody User user){
        System.out.println(id+user);
        UserExample userExample=new UserExample();
        userExample.createCriteria().andIdEqualTo(id);
        return AjaxResponse.success(userService.updateByExampleSelective(user,userExample));
    }
    @DeleteMapping("users/{id}")
    public @ResponseBody AjaxResponse deleteUser(@PathVariable String id,@RequestBody user user){
        System.out.println(id+user);
        UserExample userExample=new UserExample();
        userExample.createCriteria().andIdEqualTo(id);
        return AjaxResponse.success(userService.deleteByExample(userExample));
    }
}
