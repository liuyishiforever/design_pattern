package com.liuyishi.cnblogs.design.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
