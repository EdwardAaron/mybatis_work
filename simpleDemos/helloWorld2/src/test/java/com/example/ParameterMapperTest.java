package com.example;

import com.example.mapper.ParameterMapper;
import com.example.pojo.User;
import com.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by dfk
 * 3/10/2022
 */
public class ParameterMapperTest {

    @Test
    public void getAllUser() {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        List<User> users = parameterMapper.getAllUser();
        users.forEach(user -> System.out.println(user.toString()));
    }

    @Test
    public void getUserByUsername() {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        User user = parameterMapper.getUserByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void checkLogin() {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        User user = parameterMapper.checkLogin("admin", "123456");
        System.out.println(user);
    }

    @Test
    public void checkLoginByMap() {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123456");
        User user = parameterMapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void insertUser() {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);

        int re = parameterMapper.insertUser(
                new User(null, "李四", "123", 18, "男", "123@qq.com"));
        System.out.println(re);
    }

    @Test
    public void checkLoginByParam() {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        User user= parameterMapper.checkLoginByParam("李四", "123");
        System.out.println(user);
    }
}
