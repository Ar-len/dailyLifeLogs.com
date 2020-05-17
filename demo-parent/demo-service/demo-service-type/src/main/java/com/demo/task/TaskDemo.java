package com.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TaskDemo {
    //fixedRate 定期循环
    @Scheduled(fixedRate = 2000)
    public void totals(){
        System.out.println("123456"+new Date());
    }
}
