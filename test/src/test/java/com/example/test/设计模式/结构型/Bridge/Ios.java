package com.example.test.设计模式.结构型.Bridge;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:22
 **/
// iOS系统
public class Ios extends OperatingSystem {
    public Ios(Video video){
        super(video);
    }
    @Override
    public void play(String fileName) {
        video.decode(fileName);
    }
}
