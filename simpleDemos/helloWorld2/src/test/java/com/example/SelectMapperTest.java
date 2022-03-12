package com.example;

import com.example.mapper.SelectMapper;
import com.example.pojo.User;
import com.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.util.Map;

/**
 * created by dfk
 * 3/10/2022
 */
public class SelectMapperTest {
    @Test
    public void checkLoginByParam() {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        User user = selectMapper.getUserById(2);
        System.out.println(user);
    }
    @Test
    public void getCount() {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.getCount());
    }
    @Test
    public void getUserByIdToMap() {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        Map<String,Object> user= selectMapper.getUserByIdToMap(2);
        user.forEach((key,value)->{
            System.out.println(value);
        });
    }
    @Test
    public void getAllUserToMaps() {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUserToMaps());
    }
    @Test
    public void getAllUserToMaps2() {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUserToMaps2());
    }


}
