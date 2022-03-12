package com.example;

import com.example.mapper.EmpMapper;
import com.example.pojo.Emp;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * created by dfk
 * 3/11/2022
 */
public class PageInterTest {
    @Test
    public void pageHelperTest() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

        PageHelper.startPage(2, 4);

        List<Emp> emps= mapper.getAllEmp();
        System.out.println("==============");
        emps.forEach(emp -> System.out.println(emp));
    }
}
