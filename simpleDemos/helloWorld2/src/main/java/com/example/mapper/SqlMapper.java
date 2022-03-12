package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 不能使用#{} 模糊查询，批量删除,动态设置表名字
 *  获取自增主键
 * created by dfk
 * 3/11/2022
 */
public interface SqlMapper {
    /**
     * 根据用户命名模糊查询
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * 批量删除
     */
    int deleteManyByIds(@Param("ids") String ids);

    /**
     * 动态表名
     * 查询用户，根据表名字
     */
    List<User> getAllUserByTableName(@Param("tableName") String tableName);

    /**
     * 添加用户,得到的主键作为user的id
     */
    void insertUser(User user);
}
