package com.sforits.AndroidStudy.zuoye.exam03.topic01;

public class Family {
    private TV homeTV;

    public void buyTV(TV tv) {
        this.homeTV = tv;
    }

    public void remoteControl(int number) {
        this.homeTV.setChannel(number);
    }

    public void seeTV() {
        System.out.println("观看 " + this.homeTV.getChannel() + " 频道");
    }
}
