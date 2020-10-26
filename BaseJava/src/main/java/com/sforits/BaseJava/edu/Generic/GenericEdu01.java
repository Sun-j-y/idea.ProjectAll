package com.sforits.BaseJava.edu.Generic;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/5-19:14 Created by IntelliJ IDEA.
 */
public class GenericEdu01 {
    //泛型方法
    public static <T> void printArray(T[] inputArray) {
        // 输出数组元素
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}