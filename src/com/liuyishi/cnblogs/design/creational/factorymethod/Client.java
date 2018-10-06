package com.liuyishi.cnblogs.design.creational.factorymethod;

public class Client {


    // 工厂方法模式. 定义一个用于创建对象的接口(在本例中就是VideoFactory), 让子类(在本例中就是JavaVideoFactory等).
    // 工厂方法使一个类的实例化延迟到其子类
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}
