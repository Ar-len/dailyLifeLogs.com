package com.demo.service.impl;

import com.demo.TypeAppliction;
import com.demo.type.pojo.Type;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.lang.reflect.Array;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TypeAppliction.class)
//@AutoConfigureMockMvc
public class TypeServiceImplTest {
//    @Autowired
//    MockMvc mockMvc;
    @Autowired
    TypeServiceImpl typeService;
    @Before
    public void setUp() throws Exception {
//        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(URI.create("/type/types")))
//                .andReturn();
//        int status = mvcResult.getResponse().getStatus();
//        System.out.println(mvcResult.getResponse().getStatus());
        System.out.println("3");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("2");
    }

    @Test
    public void findAll() {
        List<Type> all = typeService.findAll();
        System.out.println(Arrays.toString(all.toArray()));
        System.out.println("1");
    }
}