package com.sforits.AndroidStudy.zuoye.exam03.topic01;

public class TV {
    private int channel = 1;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void showProgram() {
        System.out.println("当前频道为: " + getChannel());
    }
}
