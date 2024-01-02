package com.example.test.设计模式.行为型.Strategy.普通案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:28
 **/
public class Normal implements VipCard {
    @Override
    public void discount() {
        System.out.println("普通会员没有折扣");
    }
}
