package com.liuyishi.cnblogs.design.creational.simplefactory;


public class VideoFactory {

    public Video getVideo(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaVideo();
        } else if (type.equalsIgnoreCase("python")) {
            return new PythonVideo();
        } else if (type.equalsIgnoreCase("fe")) {
            return new FeVideo();
        } else {
            return null;
        }

    }


}
