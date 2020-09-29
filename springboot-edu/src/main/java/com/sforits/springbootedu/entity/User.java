package com.sforits.springbootedu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/24-19:52 Created by IntelliJ IDEA.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private Integer uid;
    private String uname;
    private String password;
    private Date set;
}