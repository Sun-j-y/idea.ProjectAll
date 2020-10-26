package com.sforits.BaseJava.AndroidBaseEdu.Exercise.Example04_01;

import org.junit.Test;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/5-20:09 Created by IntelliJ IDEA.
 */
public class TestMain {
    @Test
    public void test01() {
        Dog dog = new Dog();
        System.out.println(dog.name);
        dog.shout();

    }
}