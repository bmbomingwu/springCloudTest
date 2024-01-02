package com.example.test.设计模式.结构型.Bridge;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:23
 **/
// windows系统
public class Windows extends OperatingSystem {
    public Windows(Video video){
        super(video);
    }
    @Override
    public void play(String fileName) {
        video.decode(fileName);
    }
}
