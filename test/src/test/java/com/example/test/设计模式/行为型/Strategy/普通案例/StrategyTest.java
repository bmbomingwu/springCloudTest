package com.example.test.设计模式.行为型.Strategy.普通案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:30
 **/
public class StrategyTest {

    // 测试方法
    public static void main(String[] args) {
        //金卡打7折
        VipCardFactory.getVIPCard("gold").discount();
        //银卡打8折
        VipCardFactory.getVIPCard("silver").discount();
        //普通会员没有折扣
        VipCardFactory.getVIPCard("other").discount();
    }
}
