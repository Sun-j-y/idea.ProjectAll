package com.sforits.springbootjsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/26-17:44 Created by IntelliJ IDEA.
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        System.out.println("hello");

        return "hello";
    }
}