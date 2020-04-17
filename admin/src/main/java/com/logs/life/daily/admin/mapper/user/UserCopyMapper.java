package com.logs.life.daily.admin.mapper.user;

import java.util.List;

import com.logs.life.daily.admin.entity.user.UserCopyExample;
import org.apache.ibatis.annotations.Param;
import user.UserCopy;

public interface UserCopyMapper {
    long countByExample(UserCopyExample example);

    int deleteByExample(UserCopyExample example);

    int insert(UserCopy record);

    int insertSelective(UserCopy record);

    List<UserCopy> selectByExample(UserCopyExample example);

    int updateByExampleSelective(@Param("record") UserCopy record, @Param("example") UserCopyExample example);

    int updateByExample(@Param("record") UserCopy record, @Param("example") UserCopyExample example);
}
