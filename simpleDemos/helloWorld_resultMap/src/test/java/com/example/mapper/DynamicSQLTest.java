package com.example.mapper;

import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * created by dfk
 * 3/10/2022
 */
public class DynamicSQLTest {

    @Test
    public void getEmpsByCondition() {
        DynamicSQL mapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQL.class);
        List<Emp> emps = mapper.getEmpsByCondition(new Emp(null, "李四", 22, "女", null ));
        System.out.println(emps);
    }
    @Test
    public void getEmpsByCondition2() {
        DynamicSQL mapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQL.class);
        List<Emp> emps = mapper.getEmpsByCondition2(new Emp(null, "", 22, "女", null ));
        System.out.println(emps);
    }
    @Test
    public void getEmpsByCondition3() {
        DynamicSQL mapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQL.class);
        List<Emp> emps = mapper.getEmpsByCondition3(new Emp(null, "", 22, "女", null ));
        System.out.println(emps);
    }
    @Test
    public void getEmpsByCondition4() {
        DynamicSQL mapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQL.class);
        List<Emp> emps = mapper.getEmpsByCondition4(new Emp(null, "", 22, "女", null ));
        System.out.println(emps);
    }
    @Test
    public void deleteManyByArray() {
        DynamicSQL mapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQL.class);
        System.out.println(mapper.deleteManyByArray(new Integer[]{}));
    }
    @Test
    public void inertManyEmps() {
        DynamicSQL mapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQL.class);
        Emp emp1 = new Emp(null, "aaa", 23, "男", "123456@qq.com");
        Emp emp2 = new Emp(null, "aaa", 23, "男", "123456@qq.com");
        Emp emp3 = new Emp(null, "aaa", 23, "男", "123456@qq.com");
        System.out.println(mapper.inertManyEmps(Arrays.asList(emp1, emp2, emp3)));
    }

}
