package com.dailylifelogs.web.service.type.impl;

import ajaxResponse.CustomException;
import ajaxResponse.CustomExceptionType;
import com.dailylifelogs.web.mapper.type.TypeMapper;
import com.dailylifelogs.web.model.Type;
import com.dailylifelogs.web.model.TypeExample;
import com.dailylifelogs.web.service.type.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;

    @Override
    public List<Type> selectByExample(TypeExample example) {
        return typeMapper.selectByExample(example);
    }
}
