package com.dailylifelogs.web;

import com.dailylifelogs.web.controller.user.user;
import com.dailylifelogs.web.mapper.user.UserMapper;
import com.dailylifelogs.web.model.User;
import com.dailylifelogs.web.model.UserExample;
import com.dailylifelogs.web.service.user.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest(user.class)
public class userMockitoTsets {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    UserService userService;

    @MockBean
    UserMapper userMapper;

    @Test
    public void updateUsers() throws Exception {
        String article =
            "{\n" +
            "\"id\": \"789\",\n" +
            "\"name\": \"tomg\",\n" +
            "\"nickName\": \"手摸手教你开发spring boot\",\n" +
            "\"password\": \"123\",\n" +
            "\"phoneNumber\": \"123\"\n" +
            "}";
        ObjectMapper objectMapper = new ObjectMapper();
        User articleObj = objectMapper.readValue(article, User.class);
        //打桩
        UserExample userExample = new UserExample();
        when(userService.updateByExampleSelective(articleObj, userExample)).thenReturn(1);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.PUT, "/logs/users/456")
                .contentType("application/json").content(article))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").value(0))
                .andDo(print())
                .andReturn();

        log.info(result.getResponse().getContentAsString());
    }
    /**
     * @throws 简单
     */
    /*private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new user()).build();
    }

    *//**
     * @throws 简单
     *//*
    @Test
    public void saveArticle() throws Exception {

        String article =
                "{\n" +
                "    \"id\": \"789\",\n" +
                "    \"name\": \"tomg\",\n" +
                "    \"nickName\": \"手摸手教你开发spring boot\",\n" +
                "    \"password\": \"c\",\n" +
                "    \"phoneNumber\": \"2017-07-16 05:23:34\",\n" +
                "}";
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.GET, "/logs/users")
                .contentType("application/json").content(article))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.name").value("zimug"))
                .andDo(print())
                .andReturn();

        log.info(result.getResponse().getContentAsString());

    }*/
}