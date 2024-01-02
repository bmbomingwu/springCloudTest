package com.example.test.设计模式.创建型.Builder.链式写法;

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
        Computer asusComputer = new SimpleComputerBuilder().buildMotherBoard("Extreme主板")
                .buildCpu("Inter 12900K")
                .buildMemory("芝奇幻峰戟 16G*2")
                .buildDisk("三星980Pro 2T")
                .buildGpu("华硕3090Ti 水猛禽")
                .buildPower("雷神二代1200W")
                .buildHeatSink("龙神二代一体式水冷")
                .buildChassis("太阳神机箱").build();
        System.out.println(asusComputer);
    }
}
