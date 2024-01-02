package com.example.test.设计模式.创建型.Builder.常规写法;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:05
 **/
public class BuilderTest {

    // 测试
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector(new AsusComputerBuilder());
        // Computer(motherboard=Extreme主板, cpu=Inter 12900KS, memory=芝奇幻峰戟 16G*2, disk=三星980Pro 2T, gpu=华硕3090Ti 水猛禽, power=雷神二代1200W, heatSink=龙神二代一体式水冷, chassis=太阳神机箱)
        System.out.println(computerDirector.construct());
    }
}
