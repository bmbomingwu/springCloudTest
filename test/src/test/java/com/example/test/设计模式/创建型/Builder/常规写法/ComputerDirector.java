package com.example.test.设计模式.创建型.Builder.常规写法;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:12
 **/

// 指挥者类 指挥该组装什么电脑
@AllArgsConstructor
public class ComputerDirector {
    private ComputerBuilder computerBuilder;
    public Computer construct() {
        computerBuilder.buildMotherboard();
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildDisk();
        computerBuilder.buildGpu();
        computerBuilder.buildHeatSink();
        computerBuilder.buildPower();
        computerBuilder.buildChassis();
        return computerBuilder.build();
    }
}
