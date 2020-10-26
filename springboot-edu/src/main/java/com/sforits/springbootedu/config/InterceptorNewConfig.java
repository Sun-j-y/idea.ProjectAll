package com.sforits.springbootedu.config;

import com.sforits.springbootedu.interceptors.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/30-13:47 Created by IntelliJ IDEA.
 */
@Configuration
public class InterceptorNewConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/user/**")
                .excludePathPatterns("/user/save");
    }
}