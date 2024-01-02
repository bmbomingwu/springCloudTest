package com.example.test.设计模式.创建型.Builder.常规写法;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:10
 **/
// 抽象 builder类（接口） 组装电脑
public interface ComputerBuilder {
    Computer computer = new Computer();
    void buildMotherboard();
    void buildCpu();
    void buildMemory();
    void buildDisk();
    void buildGpu();
    void buildHeatSink();
    void buildPower();
    void buildChassis();
    Computer build();
}
