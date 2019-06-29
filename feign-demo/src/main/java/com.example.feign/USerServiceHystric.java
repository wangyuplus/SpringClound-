package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/29 18:46
 * 4
 */
@Component
public class USerServiceHystric implements UserService {
    @Override
    public String get() {
        return "sorry ";
    }
}
