package com.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan
@EnableScheduling
@EnableAsync
@MapperScan(value = "com.demo.dao")
public class TypeAppliction {
    public static void main(String[] args) {
        SpringApplication.run(TypeAppliction.class,args);
    }
}
