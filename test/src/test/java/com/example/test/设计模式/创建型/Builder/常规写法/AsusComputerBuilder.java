package com.example.test.设计模式.创建型.Builder.常规写法;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:11
 **/
// 具体 builder类 华硕ROG全家桶电脑（手动狗头）
public class AsusComputerBuilder implements ComputerBuilder {
    @Override
    public void buildMotherboard() {
        computer.setMotherboard("Extreme主板");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Inter 12900KS");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("芝奇幻峰戟 16G*2");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("三星980Pro 2T");
    }

    @Override
    public void buildGpu() {
        computer.setGpu("华硕3090Ti 水猛禽");
    }

    @Override
    public void buildHeatSink() {
        computer.setHeatSink("龙神二代一体式水冷");
    }

    @Override
    public void buildPower() {
        computer.setPower("雷神二代1200W");
    }

    @Override
    public void buildChassis() {
        computer.setChassis("太阳神机箱");
    }

    @Override
    public Computer build() {
        return computer;
    }
}

