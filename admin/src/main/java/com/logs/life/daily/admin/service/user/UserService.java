package com.logs.life.daily.admin.service.user;

import com.logs.life.daily.admin.entity.user.User;
import com.logs.life.daily.admin.entity.user.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
	List<User> getUsers();
	List<User> selectByExample(UserExample example);
}
