package com.sforits.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/26-18:46 Created by IntelliJ IDEA.
 */
@Controller
@RequestMapping("hello")
public class FirstController {
    @RequestMapping("all")
    public String findAll(Model model) {
        return "index"; // 逻辑名  前缀+逻辑名+后缀=/index.jsp
    }

}