package com.demo.service;

import com.demo.type.pojo.Type;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TypeService {
    /**
            * 按条件查询
     *
     * @return*/
    PageInfo<Type> findPage(Type type, Integer page, Integer size);
    /**
     * 按条件查询
     * */
    List<Type> findList(Type type);
    /*
    * 查询所有
    * */
    List<Type> findAll();
    /*
    * 根据ID查询
    * */
    Type findById(Integer id);
    /*
    * 增加
    * */
    void add(Type type);

    /*
    * update
    * */
    void update(Type type);

    /*
     * delete
     * */
    void delete(Integer id);
}
