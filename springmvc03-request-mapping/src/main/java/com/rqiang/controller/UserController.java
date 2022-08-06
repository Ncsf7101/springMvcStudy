package com.rqiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//1.添加pom依赖
//2.定于controller
@Controller //表现层Bean标识
@RequestMapping("/user")
public class UserController {
    //2.2 设置当前操作访问路径
    @RequestMapping("/save")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'info':'user save'}";
    }

    //2.2 设置当前操作访问路径
    @RequestMapping("/delete")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'info':'user delete'}";
    }
}
