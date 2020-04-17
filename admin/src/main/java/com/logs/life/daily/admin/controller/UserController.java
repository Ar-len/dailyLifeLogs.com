package com.logs.life.daily.admin.controller;

import com.logs.life.daily.admin.entity.user.User;
import com.logs.life.daily.admin.entity.user.UserExample;
import com.logs.life.daily.admin.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @author yuxingxing
 * @date 2020/4/17 10:00
 */
@RestController
@RequestMapping("/logs/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("users")
	public List<User> selectByExample(){
		UserExample userExample = new UserExample();
		return userService.getUsers();
	}
	
}
