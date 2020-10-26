package com.sforits.springbootedu.controller;

import com.sforits.springbootedu.entity.User;
import com.sforits.springbootedu.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/23-19:51 Created by IntelliJ IDEA.
 */
@RestController
@RequestMapping("hello")
public class FirstController {
    @Autowired
    private User user;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private Calendar calendar;
    @Autowired
    private Calendar calendar1;
    // 变量注入
    @Value("${name}")
    private String name;
    @Value("${bir}")
    private Date bir;
    @Value("${strs}")
    private String[] strs;
    @Value("${qqs}")
    private List<String> qqs;

    //    @Value("#{${map}}")
    private Map<String, String> maps;

    @RequestMapping("hello")
    public String hello() {

        System.out.println("Hello SpringBoot!!!");
        System.out.println(user);
        userService.save(user);
        System.out.println("-----------------------------------");
        System.out.println(calendar);
        System.out.println(calendar1);
        System.out.println(calendar.getTime());
        System.out.println(calendar == calendar1);
        System.out.println("----------------------------------");
        System.out.println(name);
        System.out.println("bir = " + bir);
        for (String str : strs) {
            System.out.println(str);
        }
        // lambda表达式
        qqs.forEach(qq -> System.out.println("qq = " + qq));
        // maps.forEach((k, v) -> System.out.println("Key = " + k + "  value = " + v));
        return "Hello SpringBoot";
    }

    /**
     * 测试拦截器
     */
    @RequestMapping("inter")
    public String interceptorTest() {
        System.out.println("拦截器放行了");
        return "Hello Interceptor";
    }
}
