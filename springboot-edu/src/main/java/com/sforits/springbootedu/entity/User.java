package com.sforits.springbootedu.entity;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/24-19:52 Created by IntelliJ IDEA.
 */
@Data
@Configuration
public class User {
    private Integer uid;
    private String username;
    private String password;
}