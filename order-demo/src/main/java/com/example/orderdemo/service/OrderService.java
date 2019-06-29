package com.example.orderdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderService {

    @Autowired
    RestTemplate restTemplate;

    public String getUser(int id){
        String url="http://user/user?id="+id;

        String info=restTemplate.getForObject(url,String.class);
        return info;
    }
    public String findAllUser(){
        String url="http://user/getUser";

        String info=restTemplate.getForObject(url,String.class);
        return info;
    }
}
