package com.demo.service.impl;

import com.demo.dao.TypeMapper;
import com.demo.service.TypeService;
import com.demo.type.pojo.Type;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    Md5 md5;
    @Autowired
    RedisClient redisClient;
    @Autowired
    private TypeMapper typeMapper;

    /**
     * 按条件查询
     *  @param type
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Type> findPage(Type type, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        return new PageInfo<Type>(typeMapper.selectByExample(createExample(type)));
    }

    /**
     * 按条件查询
     *
     * @param type
     */
    @Override
    public List<Type> findList(Type type) {
        return typeMapper.selectByExample(createExample(type));
    }

    @Override
    public List<Type> findAll() {
        redisClient.stringSet("types", JsonUtil.objZString(typeMapper.selectAll()));
        System.out.println(redisClient.stringGet("types"));
        return typeMapper.selectAll();
    }

    @Override
    public Type findById(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(Type type) {
        typeMapper.insertSelective(type);
    }

    @Override
    public void update(Type type) {
        typeMapper.updateByPrimaryKeySelective(type);
    }

    @Override
    public void delete(Integer id) {
        typeMapper.deleteByPrimaryKey(id);
    }

    public Example createExample(Type type){
        Example example = new Example(Type.class);
        Example.Criteria criteria = example.createCriteria();
        if(type!=null){
            if (!StringUtil.isEmpty(type.getType())) {
                criteria.andLike("type","%"+type.getType()+"%");
            }
            if (!StringUtil.isEmpty(type.getTypeName())) {
                criteria.andLike("typeName","%"+type.getTypeName()+"%");
            }
            if (type.getCreatTime()!=null) {
                criteria.andEqualTo("creatTime", type.getCreatTime());
            }
        }
        return example;
    }
}
