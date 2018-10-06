package com.liuyishi.cnblogs.design.creational.simplefactory;

public class Client {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video != null) {
            video.produce();
        }
    }


}
