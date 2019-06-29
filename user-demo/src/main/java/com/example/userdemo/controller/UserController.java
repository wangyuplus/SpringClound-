package com.example.userdemo.controller;

import com.example.userdemo.mapper.UserMapper;
import com.example.userdemo.po.User;
import com.example.userdemo.service.UserService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class UserController {

    @Autowired
    UserService userService;


    @Value("${server.port}")
    int port;

    @RequestMapping("/user")
    public String getUser(@RequestParam("id") int id){
        if(id==1){
            return "王豫"+port;
        }else if(id==2){
            return "何浩飞"+port;
        }else {
            return "黄钟"+port;
        }
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public List<User> getUser(){
        return  userService.getUser();
    }



}
