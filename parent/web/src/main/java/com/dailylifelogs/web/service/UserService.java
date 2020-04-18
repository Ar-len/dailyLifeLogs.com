package com.dailylifelogs.web.service;

import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    List<User> selectByExample(UserExample userExample);
}
