package com.sforits.springbootedu.service;

import com.sforits.springbootedu.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/25-14:25 Created by IntelliJ IDEA.
 */
@Service
public class UserServiceImpl  implements UserService{
    @Override
    public void save(User user) {
        System.out.println(user);
    }
}