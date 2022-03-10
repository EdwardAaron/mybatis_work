package com.example;

import com.example.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * created by dfk
 * 3/10/2022
 */
public class MyBatis {
    @Test()
    public void testMybatis() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        Assert.assertEquals(result,1);
        sqlSession.commit();
    }
}
