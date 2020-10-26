package com.sforits.BaseJava.线程;

import org.junit.Test;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/15-19:27 Created by IntelliJ IDEA.
 */
public class CreateThreadTwo implements Runnable {
    /*
    创建线程的三种方式 其一
    通过Runnable接口创建线程类
        1. 定义runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
        2. 创建 Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
        3. 调用线程对象的start()方法来启动该线程。
    */

    // 重写run方法，run方法的方法体就是现场执行体
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    @Test
    public void Test() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            if (i == 2) {
                CreateThreadTwo rtt = new CreateThreadTwo();
                new Thread(rtt, "新线程1").start();
                new Thread(rtt, "新线程2").start();
            }
        }
    }
}