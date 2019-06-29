package com.example.userdemo.mapper;

import com.example.userdemo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/29 0:08
 * 4
 */
@Mapper
public interface UserMapper {
    @Select("Select * from user")
    List<User> findAll();
}
