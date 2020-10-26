package com.sforits.springbootedu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/30-13:50 Created by IntelliJ IDEA.
 */
@RestController
@RequestMapping("user")
@Slf4j
public class InterceptorNewTestController {

    @RequestMapping("findall")
    public String findAll() {
        log.info("执行findAll方法");
        return "findAll";
    }

    @RequestMapping("save")
    public String save() {
        log.info("执行save方法");
        return "save";
    }
}