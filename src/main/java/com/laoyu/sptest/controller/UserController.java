package com.laoyu.sptest.controller;

import com.laoyu.sptest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    public String hello(){
        return "hello world";
    }
}
