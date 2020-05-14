package com.demo.service.impl;

import com.demo.entity.Type;
import com.demo.mapper.TypeMapper;
import com.demo.service.TypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Arlen123
 * @since 2020-05-15
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
