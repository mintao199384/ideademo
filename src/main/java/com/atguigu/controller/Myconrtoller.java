package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myconrtoller {

    @RequestMapping("/he")
    public String hello(){

        //System.out.println("hello");
        System.out.println("fuck you,这是我的第一个分支");
        //fenzhi
        return "hello";
    }

}
