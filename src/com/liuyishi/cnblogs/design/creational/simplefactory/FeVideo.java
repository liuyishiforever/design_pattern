package com.liuyishi.cnblogs.design.creational.simplefactory;

public class FeVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制了FE视频");
    }
}
