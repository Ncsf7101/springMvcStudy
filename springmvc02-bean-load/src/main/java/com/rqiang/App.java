package com.rqiang;

import com.rqiang.config.SpringConfig;
import com.rqiang.controller.UserController;
import com.rqiang.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //System.out.println(ctx.getBean(UserController.class));
    }
}
