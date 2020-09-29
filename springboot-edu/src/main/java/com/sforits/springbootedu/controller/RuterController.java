package com.sforits.springbootedu.controller;

import com.sforits.springbootedu.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/23-19:51 Created by IntelliJ IDEA.
 */
@Controller
//@RequestMapping("$")
@Slf4j
public class RuterController {

    @GetMapping("index")
    public String index(HttpServletRequest request, Model model) {
        System.out.println("Hello SpringBoot!!!");
        model.addAttribute("name", "小黑");
        model.addAttribute("age", 15);
        model.addAttribute("aaa", "<a href=''>黑</a>");
        model.addAttribute("user", new User(41000002, "小明", "test", new Date()));
        System.out.println("SpringBoot热部署!!!");

        log.info("info信息: -------------------");
        log.debug("debug信息: -------------");

        return "index";
    }

    @RequestMapping("/upload")
    public String fileUpload() {
        return "/file/fileupload";
    }
}