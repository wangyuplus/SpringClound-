package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;import java.util.ArrayList;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/29 18:02
 * 4
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/get")
    public String sayHi() {

        String result=userService.get();

        return result;
    }

}
