package com.example.mapper;

import com.example.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 表和类的字段名不一致
 * 处理多对一关系
 * 分布查询
 * created by dfk
 * 3/11/2022
 */
public interface EmpMapper {
    /**
     * 查询所有
     */
    List<Emp> getAllEmpOld();
    /**
     * 查询所有
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工极其部门信息
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);
    /**
     * 查询员工极其部门信息
     */
    Emp getEmpAndDept2(@Param("eid") Integer eid);
    /**
     * 查询员工极其部门信息
     * 分布查询：
     *  step 1
     *  step 2 在DeptMapper中的Dept getById(@Param("did") Integer did);
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
     * 根据部门id查询员工
     */
    List<Emp> getEmpsByDid(@Param("did") Integer did);
}
