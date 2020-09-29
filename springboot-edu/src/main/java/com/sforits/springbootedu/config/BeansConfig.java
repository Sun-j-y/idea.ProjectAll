package com.sforits.springbootedu.config;

import com.sforits.springbootedu.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/25-12:49 Created by IntelliJ IDEA.
 */
@Configuration
public class BeansConfig {
    //    这也是将对象交割spring来管理的一种方式
//    @Bean   // @Bean 将当前返回值作为工厂中的一个对象来管理
    public User getUser() {
        return new User();
    }
    @Bean//(name="aaa")  // 用来将方法返回值交给springboot管理 在工厂中的默认标识:返回值类名的首字母小写
    @Scope("prototype")  // prototype: 多例   singleton:(默认) 单例
    public Calendar getCalendar(){
        return Calendar.getInstance();
    }
}