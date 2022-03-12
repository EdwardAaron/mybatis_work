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
    List<Emp> getAllEmp();
}
