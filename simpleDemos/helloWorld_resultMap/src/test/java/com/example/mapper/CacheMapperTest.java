package com.example.mapper;

import com.example.pojo.Emp;
import com.example.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * created by dfk
 * 3/10/2022
 */
public class CacheMapperTest {
    /**
     * 一级缓存
     */
    @Test
    public void test1() {
        //相同的查询条件，从缓存中查找
        CacheMapper mapper = SqlSessionUtils.getSqlSession().getMapper(CacheMapper.class);
        System.out.println(mapper.getEmpByEid(12));
        System.out.println(mapper.getEmpByEid(13));
        System.out.println(mapper.getEmpByEid(12));
    }

    /**
     * 二级缓存
     */
    @Test
    public void test2() throws  Exception{
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");;
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);

        SqlSession sqlSession1=sqlSessionFactory.openSession();
        CacheMapper mapper = sqlSession1.getMapper(CacheMapper.class);
        System.out.println(mapper.getEmpByEid(12));
        sqlSession1.close();

        SqlSession sqlSession2=sqlSessionFactory.openSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        System.out.println(mapper2.getEmpByEid(12));
        sqlSession1.close();
    }

}
