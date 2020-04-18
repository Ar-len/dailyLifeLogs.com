package com.dailylifelogs.web.service.impl;

import com.dailylifelogs.web.mapper.user.UserDao;
import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import com.dailylifelogs.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 加载
     */
    @Autowired
    UserDao userDao;

    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @Override
    public List<User> selectByExample(UserExample userExample) {
        return userDao.selectByExample(userExample);
    }
}
