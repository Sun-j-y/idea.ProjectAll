package com.sforits.BaseJava.线程;

import org.junit.Test;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/15-19:27 Created by IntelliJ IDEA.
 */
public class CreateThreadOne extends Thread {
    /*
    创建线程的三种方式 其一
    继承Thread类创建线程类
        1. 定义Thread类的子类，并重写该类的run方法，该run方法的方法体就代表了线程要完成的任务。因此把run()方法称为执行体。
        2. 创建Thread子类的实例，即创建了线程对象。
        3. 调用线程对象的start()方法来启动该线程。
    */

    // 重写run方法，run方法的方法体就是现场执行体
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "  " + i);
        }
    }

    @Test
    public void Test() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            if (i == 2) {
                new CreateThreadOne().start();
                new CreateThreadOne().start();
            }
        }
    }
}