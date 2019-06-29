package com.example.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/29 20:25
 * 4
 */
@SpringBootApplication
@EnableEurekaClient
public class Restful {
    public static void main(String[] args) {
        SpringApplication.run(Restful.class,args);
    }
}