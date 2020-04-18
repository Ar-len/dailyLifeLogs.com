package com.dailylifelogs.web.mapper.user;

import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao {
    List<User> getUsers();
    List<User> selectByExample(UserExample userExample);
}