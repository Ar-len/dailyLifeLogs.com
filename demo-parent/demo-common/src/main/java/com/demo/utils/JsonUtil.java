package com.demo.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;

public class JsonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String objZString(T obj){
        if(obj ==null){
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T stringZObj(String str,Class<T> clazz){
        if(StringUtils.isEmpty(str) || clazz ==null){
            return null;
        }
        try {
            return clazz.equals(String.class)?(T) str:objectMapper.readValue(str,clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
