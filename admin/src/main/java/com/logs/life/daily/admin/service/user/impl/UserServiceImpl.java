package com.logs.life.daily.admin.service.user.impl;

import com.logs.life.daily.admin.entity.user.User;
import com.logs.life.daily.admin.entity.user.UserExample;
import com.logs.life.daily.admin.mapper.user.UserMapper;
import com.logs.life.daily.admin.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yuxingxing
 * @date 2020/4/17 16:03
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}
	
	@Override
	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}
}
