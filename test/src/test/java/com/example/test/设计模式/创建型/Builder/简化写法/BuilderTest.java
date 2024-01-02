package com.example.test.设计模式.创建型.Builder.简化写法;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:26
 **/
public class BuilderTest {

    // 测试
    public static void main(String[] args) {
        SimpleComputerBuilder simpleComputerBuilder = new SimpleComputerBuilder();
        simpleComputerBuilder.buildMotherBoard("Extreme主板");
        simpleComputerBuilder.buildCpu("Inter 12900K");
        simpleComputerBuilder.buildMemory("芝奇幻峰戟 16G*2");
        simpleComputerBuilder.buildDisk("三星980Pro 2T");
        simpleComputerBuilder.buildGpu("华硕3090Ti 水猛禽");
        simpleComputerBuilder.buildPower("雷神二代1200W");
        simpleComputerBuilder.buildHeatSink("龙神二代一体式水冷");
        simpleComputerBuilder.buildChassis("太阳神机箱");
        // Computer(motherboard=Extreme主板, cpu=Inter 12900K, memory=芝奇幻峰戟 16G*2, disk=三星980Pro 2T, gpu=华硕3090Ti 水猛禽, power=雷神二代1200W, heatSink=龙神二代一体式水冷, chassis=太阳神机箱)
        System.out.println(simpleComputerBuilder.build());
    }
}
