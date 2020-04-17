package com.logs.life.daily.admin.mapper.user;

import com.logs.life.daily.admin.entity.user.User;
import com.logs.life.daily.admin.entity.user.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserMapper {
    
    List<User> getUsers();
    
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}
