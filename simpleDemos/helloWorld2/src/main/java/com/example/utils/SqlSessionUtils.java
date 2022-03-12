package com.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * created by dfk
 * 3/10/2022
 */
public class SqlSessionUtils {
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
    public static SqlSession getSqlSession() {
        return sqlSession;
    }
}
