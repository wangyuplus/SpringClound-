package com.example.orderdemo.controller;

import com.example.orderdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/order")
    public String addOrder(@RequestParam("id") int id){
        String result=orderService.getUser(id);

        return "生成订单:"+result;
    }
    @RequestMapping("/order/getAllUser")
    public String getAllUser(){
        String result=orderService.findAllUser();

        return "生成订单:"+result;
    }
}
