package com.rqiang.controller.interceptor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contentType = request.getHeader("Content-Type");
        //HandlerMethod handlerMethod = (HandlerMethod) handler;
        System.out.println("preHandle..." + contentType);
        return true;//false中止原始操作的执行，如果中止，无法向下执行。多个拦截器链，当返回false也会直接终止
                        //相当于带俩三层 手套 帽子  鞋套，先穿后脱；
                        //第三层false,返回第二层->第一层afterCompletion
                        //第二层false,返回第一层afterCompletion
                        //第一层false,直接推出
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterHandle...");
    }
}
