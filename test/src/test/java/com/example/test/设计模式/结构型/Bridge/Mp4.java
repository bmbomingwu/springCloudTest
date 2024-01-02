package com.example.test.设计模式.结构型.Bridge;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:22
 **/
// MP4格式类
public class Mp4 implements Video{
    @Override
    public void decode(String fileName) {
        System.out.println("MP4视频文件："+ fileName);
    }
}
