package com.example.test;

import com.example.mapper.EmpMapper;
import com.example.pojo.Emp;
import com.example.pojo.EmpExample;
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
public class MBGTest {
    @Test
    public void selectTest() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);

        //查询所有数据
//        List<Emp> emps= mapper.selectByExample(null);
//        emps.forEach(emp -> System.out.println(emp));

        //根据条件查询
        EmpExample example = new EmpExample();
        example.createCriteria()
                .andEmpNameEqualTo("李四")
        .andAgeGreaterThan(20);
        example.or().andDidIsNotNull();
        List emps = mapper.selectByExample(example);
        emps.forEach(emp-> System.out.println(emp));
    }
    @Test
    public void updateTest() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        mapper.updateByPrimaryKey(new Emp(12, "张三", 22, "b", "aa@qq.com", 3));
    }
}
