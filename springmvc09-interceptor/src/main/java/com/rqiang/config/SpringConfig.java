package com.rqiang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//3.创建springmvc的配置文件，加载controller对应的bean
//@Configuration
//@ComponentScan({"com.rqiang.service","com.rqiang.dao"})
@ComponentScan(value="com.rqiang", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
public class SpringConfig {
}
