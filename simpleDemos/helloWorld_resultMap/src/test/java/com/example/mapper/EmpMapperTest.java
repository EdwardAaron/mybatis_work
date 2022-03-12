package com.example.mapper;

import com.example.pojo.Emp;
import com.example.utils.SqlSessionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * created by dfk
 * 3/10/2022
 */
public class EmpMapperTest {

    @Test
    public void getAllEmpOld() {
        EmpMapper empMapper = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        List<Emp> emps = empMapper.getAllEmpOld();
        emps.forEach(emp-> System.out.println(emp));
    }
    @Test
    public void getAllEmp() {
        EmpMapper empMapper = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        List<Emp> emps = empMapper.getAllEmp();
        emps.forEach(emp-> System.out.println(emp));
    }
    @Test
    public void getEmpAndDept() {
        EmpMapper empMapper = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpAndDept(1);
        System.out.println(emp);
    }
    @Test
    public void getEmpAndDept2() {
        EmpMapper empMapper = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpAndDept2(1);
        System.out.println(emp);
    }
    @Test
    public void getEmpAndDeptByStepOne() {
        EmpMapper empMapper = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
        Emp emp = empMapper.getEmpAndDeptByStepOne(1);
        System.out.println(emp.getEmpName()); //会触发延迟加载
        System.out.println("+++++++++++++++++===");
        System.out.println(emp);
        System.out.println(emp.getClass().getName());//Emp的衍生类
    }







}
