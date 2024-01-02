package com.example.test.设计模式.结构型.Bridge;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:24
 **/
public class BridgeTest {

    public static void main(String[] args) {
        Video mp4 = new Mp4();
        Windows windows = new Windows(mp4);
        windows.play("封神演义");
    }
}
