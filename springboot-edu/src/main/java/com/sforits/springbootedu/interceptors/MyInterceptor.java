package com.sforits.springbootedu.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/30-13:00 Created by IntelliJ IDEA.
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 预先处理 最先执行
     *
     * @param request
     * @param response
     * @param handler
     * @return true 放行  false 中断请求
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入拦截器........preHandle方法");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("进入拦截器........postHandle方法");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("进入拦截器........afterCompletion方法");
    }

}