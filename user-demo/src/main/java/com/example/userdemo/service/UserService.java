package com.example.userdemo.service;

import com.example.userdemo.mapper.UserMapper;
import com.example.userdemo.po.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/29 0:04
 * 4
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //@HystrixCommand(fallbackMethod = "hiError")
    public List<User> getUser() {
      return   userMapper.findAll();
    }

    public String hiError() {
        return "sorry,error!";
    }
}
