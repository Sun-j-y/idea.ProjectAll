package com.sforits.springbootedu.config;

import com.sforits.springbootedu.interceptors.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/30-13:09 Created by IntelliJ IDEA.
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /*
         * addInterceptor   添加拦截器
         * addPathPatterns  添加拦截器路径
         * excludePathPatterns  排除拦截路径
         */
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/hello/**")
                .excludePathPatterns("/hello/hello");
    }
}