package com.sforits.AndroidStudy.zuoye.exam03.topic02;

public class MainClass {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        System.out.println("边长为 2 的正方形的面积为" + square.area(2));
        System.out.println("半径为 3 的圆的面积为" + circle.area(3));
    }
}
