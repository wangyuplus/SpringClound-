package com.example.userdemo.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 2 * @Author: wangyu
 * 3 * @Date: 2019/6/28 23:41
 * 4
 */
@Data
public class User implements Serializable {
    private  Integer id;
    private String username;

    private String password;
    private String role;
}
