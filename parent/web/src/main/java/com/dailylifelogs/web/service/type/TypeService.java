package com.dailylifelogs.web.service.type;

import com.dailylifelogs.web.model.Type;
import com.dailylifelogs.web.model.TypeExample;

import java.util.List;

public interface TypeService {
    List<Type> selectByExample(TypeExample example);
}
