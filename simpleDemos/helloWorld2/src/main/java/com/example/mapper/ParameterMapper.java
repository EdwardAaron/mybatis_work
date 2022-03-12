package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 使用参数
 * created by dfk
 * 3/10/2022
 */
public interface ParameterMapper {
    /*
        mybatis 获取参数的两种方式
        ${}:字符串拼接(尽量不用)
        #{}:占位符赋值
     */


    /**
     * 添加用户
     */
    int insertUser(User user);
    /**
     * 验证登录
     */
    User checkLogin(String username, String password);
    /**
     * 验证登录
     */
    User checkLoginByMap(Map<String,Object> map);
    /**
     * 验证登录(使用@param)
     */
    User checkLoginByParam(@Param("username") String username, @Param("password")String password);
    /**
     * 根据用户名查询用户信息
     */
    User getUserByUsername(String username);
    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();
}
