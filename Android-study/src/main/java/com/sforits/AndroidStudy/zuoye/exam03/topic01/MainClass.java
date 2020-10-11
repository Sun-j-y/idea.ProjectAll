package com.sforits.AndroidStudy.zuoye.exam03.topic01;

public class MainClass {
    public static void main(String[] args) {
        TV hairTV = new TV();
        Family zhangsan = new Family();
        zhangsan.buyTV(hairTV);
        hairTV.showProgram();
        zhangsan.seeTV();
        // 修改频道
        zhangsan.remoteControl(5);
        zhangsan.seeTV();
    }
}
