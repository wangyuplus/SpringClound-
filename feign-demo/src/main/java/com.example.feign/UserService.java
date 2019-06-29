package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/29 18:08
 * 4
 */
@Service
@FeignClient(value = "user",fallback = USerServiceHystric.class)
public interface UserService {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    String get();

}
