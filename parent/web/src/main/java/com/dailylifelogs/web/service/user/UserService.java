package com.dailylifelogs.web.service.user;

import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> selectByExample(UserExample userExample);

    int insertSelective(User record);

    int deleteByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);
}
