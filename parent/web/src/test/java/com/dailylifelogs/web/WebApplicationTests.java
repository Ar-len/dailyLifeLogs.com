package com.dailylifelogs.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Supplier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    public void contextLoads() {
        Logger logger = LoggerFactory.getLogger(WebApplicationTests.class);
        stringRedisTemplate.opsForValue().set("name1","hello");
        logger.info(() ->stringRedisTemplate.opsForValue().get("name1"));
    }

}
