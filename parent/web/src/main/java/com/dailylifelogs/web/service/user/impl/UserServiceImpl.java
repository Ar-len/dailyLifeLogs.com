package com.dailylifelogs.web.service.user.impl;

import com.dailylifelogs.web.mapper.user.UserMapper;
import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import com.dailylifelogs.web.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 加载
     */
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectByExample(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record,example);
    }
}
