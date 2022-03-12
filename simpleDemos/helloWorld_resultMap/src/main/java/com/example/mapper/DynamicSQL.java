package com.example.mapper;

import com.example.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 动态sql
 * created by dfk
 * 3/11/2022
 */
public interface DynamicSQL {
    /**
     * 多条件查询
     */
    List<Emp> getEmpsByCondition(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpsByCondition2(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpsByCondition3(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpsByCondition4(Emp emp);

    /**
     * 通过ids批量删除
     */
    int deleteManyByArray(@Param("eids") Integer[] eids);

    /**
     * 批量添加
     */
    int inertManyEmps(@Param("emps") List<Emp> emps);
}
