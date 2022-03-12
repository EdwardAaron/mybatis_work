package com.example.mapper;

import com.example.pojo.Dept;
import com.example.pojo.Emp;
import com.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.List;

/**
 * created by dfk
 * 3/10/2022
 */
public class DeptMapperTest {

    @Test
    public void getDeptAndEmp() {
        DeptMapper mapper = SqlSessionUtils.getSqlSession().getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmp(1);
        System.out.println(dept);
    }
    @Test
    public void getDeptAndEmpByStep() {
        DeptMapper mapper = SqlSessionUtils.getSqlSession().getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStep(1);
        System.out.println(dept);
        System.out.println(dept.getClass().getName());
    }

}
