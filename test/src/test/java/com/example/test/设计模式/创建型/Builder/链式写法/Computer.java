package com.example.test.设计模式.创建型.Builder.链式写法;

import lombok.Data;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:10
 **/
//产品类 电脑
@Data
public class Computer {
    private String motherboard;
    private String cpu;
    private String memory;
    private String disk;
    private String gpu;
    private String power;
    private String heatSink;
    private String chassis;
}


