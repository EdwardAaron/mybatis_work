package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 查询功能的mapper
 * created by dfk
 * 3/10/2022
 */
public interface SelectMapper {
    /**
     * 根据id查询用户信息
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询记录数
     */
    int getCount();

    /**
     * 根据id查询用户，结果为map
     */
    Map<String, Object> getUserByIdToMap(@Param("id") int id);

    /**
     * 查询所有用户信息返回map集合
     */
    List<Map<String, Object>> getAllUserToMaps();

    /**
     * 查询所有用户信息返回map集合
     * 使用MapKey
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMaps2();

}
