package com.rqiang.controller;

import com.rqiang.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//1.添加pom依赖
//2.定于controller
@Controller //表现层Bean标识
@RequestMapping
public class UserController {
//    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String save(@PathVariable User user){
//        System.out.println("user save..." + user);
//        return "{'module':'user save'}";
//    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }
//
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable int id){
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }
//
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }
//
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user save..." + id);
        return "{'module':'user getById'}";
    }
//
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }




}
