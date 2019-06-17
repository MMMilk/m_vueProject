package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void test(String username,String password){
        System.out.println(username+"====="+password);
    }
}
