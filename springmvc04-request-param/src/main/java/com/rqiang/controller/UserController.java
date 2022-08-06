package com.rqiang.controller;

import com.rqiang.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

//1.添加pom依赖
//2.定于controller
@Controller //表现层Bean标识
@RequestMapping
public class UserController {
    //2.2 设置当前操作访问路径
    @RequestMapping("/commonParam")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String commonParam(String name, int age){
        System.out.println("普通参数传递：name==>" + name);
        System.out.println("普通参数传递：age==>" + age);
        return "{'module':'common param'}";
    }

    @RequestMapping("/commonParamDifferentName")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, int age){
        System.out.println("普通参数传递：userName==>" + userName);
        System.out.println("普通参数传递：age==>" + age);
        return "{'module':'common param different name'}";
    }

    @RequestMapping("/pojoParam")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递：user==>" + user);
        return "{'module':'pojo param'}";
    }

    @RequestMapping("/pojoContainPojoParam")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo嵌套pojo参数传递：user==>" + user);
        return "{'module':'pojo containPojo param'}";
    }

    @RequestMapping("/arrayParam")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递：likes==>" + Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    @RequestMapping("/listParam")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("列表参数传递：likes==>" + likes.toString());
        return "{'module':'list param'}";
    }

    @RequestMapping("/listParamForJson")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("列表（json）参数传递：likes==>" + likes.toString());
        return "{'module':'list param for json param'}";
    }

    @RequestMapping("/pojoParamForJson")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo参数（json）传递：user==>" + user);
        return "{'module':'pojo param for json param'}";
    }

    @RequestMapping("/pojoContainPojoParamForJson")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> user){
        System.out.println("pojo嵌套pojo参数（json）传递：user==>" + user);
        return "{'module':'list pojo param for json param'}";
    }

    @RequestMapping("/dataParam")
    //2.3设置当前操作返回值类型
    @ResponseBody
    public String listParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1
                        ,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS") Date date2){
        System.out.println("日期参数传递：date==>" + date);
        System.out.println("日期参数传递：date1==>" + date1);
        System.out.println("日期参数传递：date2==>" + date2);
        return "{'module':'date param'}";
    }
}
