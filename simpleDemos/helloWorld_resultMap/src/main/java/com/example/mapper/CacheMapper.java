package com.example.mapper;

import com.example.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * created by dfk
 * 3/11/2022
 */
public interface CacheMapper {
    Emp getEmpByEid(@Param("eid") Integer eid);
}
