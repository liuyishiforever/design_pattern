package com.liuyishi.cnblogs.design.creational.simplefactory;

public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制了Java视频");
    }
}
