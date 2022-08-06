package com.rqiang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//3.创建springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.rqiang.controller")
public class SpringMvcConfig {
}
