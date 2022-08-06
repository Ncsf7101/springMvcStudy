package com.rqiang.controller;

import com.rqiang.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ResController {

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回Json对象数据");
        User user = new User();
        user.setName("rqiang");
        user.setAge(22);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("杀杀杀");
        user1.setAge(12);

        User user2 = new User();
        user2.setName("杀杀杀");
        user2.setAge(13);

        User user3 = new User();
        user3.setName("杀杀杀");
        user3.setAge(14);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
}
