package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * created by dfk
 * 3/10/2022
 */
public class UserMapperTest {
    private static final SqlSession sqlSession;

    static {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //SqlSession 默认是不提交事务的
        sqlSession = sqlSessionFactory.openSession(true);
    }


    @Test()
    public void insertUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        Assert.assertEquals(result, 1);
        //        sqlSession.commit();
    }

    @Test
    public void updateUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.updateUser());
    }

    @Test
    public void deleteUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.deleteUser());
    }

    @Test
    public void getUserById() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById();
        System.out.println(user);
    }
    @Test
    public void getAllUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users= userMapper.getAllUser();
        users.forEach(user -> System.out.println(user.toString()));
    }
}
