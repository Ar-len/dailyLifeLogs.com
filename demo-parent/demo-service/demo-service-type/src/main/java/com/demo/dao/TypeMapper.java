package com.demo.dao;

import com.demo.type.pojo.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface TypeMapper extends Mapper<Type> {
}
