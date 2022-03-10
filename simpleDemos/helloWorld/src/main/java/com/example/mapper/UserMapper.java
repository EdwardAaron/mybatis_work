package com.example.mapper;

/**
 * created by dfk
 * 3/10/2022
 */
public interface UserMapper {
    /**
     *  mybatis 面向接口编程的两个一致：
     *  1 映射文件的namespace和mapper的全类名一致
     *  2 映射文件中的sql语句id和mapper中的方法名一致
     */

    /**
     * 添加用户信息
     */
    int insertUser();
}
