package com.example.mapper;

import com.example.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * created by dfk
 * 3/11/2022
 */
public interface DeptMapper {
    /**
     * 根据did查询部门
     */
    Dept getById(@Param("did") Integer did);

    /**
     * 根据did查询部门和员工
     */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
     * 查询部门和其中的员工信息
     * 分步查询第一步：查询部门信息
     */
    Dept getDeptAndEmpByStep(@Param("did") Integer did);
}
