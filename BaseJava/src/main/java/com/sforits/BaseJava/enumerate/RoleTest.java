package com.sforits.BaseJava.enumerate;

import org.junit.Test;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/9/24-17:26 Created by IntelliJ IDEA.
 */
public class RoleTest {
    @Test
    public void testOne(){
        Role r1= Role.valueOf("学生");
        System.out.println(r1);
    }
}