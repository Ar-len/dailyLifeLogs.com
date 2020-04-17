package com.logs.life.daily.admin.mapper.user;

import java.util.List;

import com.logs.life.daily.admin.entity.user.TypeExample;
import org.apache.ibatis.annotations.Param;
import user.Type;

public interface TypeMapper {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);
}
