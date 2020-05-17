package com.demo.controller;

import com.demo.service.TypeService;
import com.demo.task.AsyncDemo;
import com.demo.type.pojo.Type;
import com.github.pagehelper.PageInfo;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitRetryTemplateCustomizer;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/type/")
@CrossOrigin
public class TypeController {

    @Autowired
    AsyncDemo asyncDemo;

    @Autowired
    private TypeService typeService;

    @GetMapping("types")
    public Result<List<Type>> findAll() {
        long t1 = System.currentTimeMillis();
        asyncDemo.task1();
        asyncDemo.task2();
        Future<String> future = asyncDemo.task3();
        for (;;){
            if(future.isDone()){
                break;
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1+"4");
        return new Result<List<Type>>(true, StatusCode.OK, "成功", typeService.findAll());
    }

    @GetMapping("type/{id}")
    public Result<Type> findById(@PathVariable(value = "id")Integer id){

        return new Result<Type>(true,StatusCode.OK,"成功",typeService.findById(id));
    }

    @PostMapping("type")
    public Result add(@RequestBody Type type){
        typeService.add(type);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    @PutMapping("type/{id}")
    public Result update(@RequestBody Type type,@PathVariable(value = "id") Integer id){
        type.setId(id);
        typeService.update(type);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    @DeleteMapping("type/{id}")
    public Result delete(@PathVariable(value = "id") Integer id){
        typeService.delete(id);
        return new Result(true,StatusCode.OK,"delete成功");
    }

    @PostMapping("type/findList")
    public List<Type> findList(@RequestBody Type type){
        return typeService.findList(type);
    }

    @PostMapping("type/findList/{page}/{size}")
    public Result<PageInfo<List<Type>>> findList(@RequestBody Type type, @PathVariable(value = "page") Integer page,
                                     @PathVariable(value ="size") Integer size){
        return new Result<>(true, StatusCode.OK, "成功", typeService.findPage(type, page, size));
    }

}
