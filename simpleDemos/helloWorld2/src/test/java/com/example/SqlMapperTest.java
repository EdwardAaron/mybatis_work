package com.example;

import com.example.mapper.SqlMapper;
import com.example.pojo.User;
import com.example.utils.SqlSessionUtils;
import org.junit.Test;

/**
 * created by dfk
 * 3/10/2022
 */
public class SqlMapperTest {

    @Test
    public void getAllUserToMaps2() {
        SqlMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SqlMapper.class);
        System.out.println(sqlMapper.getUserByLike("a"));
    }

    @Test
    public void deleteManyByIds() {
        SqlMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SqlMapper.class);
        System.out.println(sqlMapper.deleteManyByIds("1,2,3"));
    }
    @Test
    public void getAllUserByTableName() {
        SqlMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SqlMapper.class);
        System.out.println(sqlMapper.getAllUserByTableName("t_user"));
    }

    @Test
    public void insertUser() {
        SqlMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SqlMapper.class);
        User user = new User(null, "李四", "123", 18, "男", "123@qq.com");
        sqlMapper.insertUser(user);
        System.out.println(user);
    }


}
