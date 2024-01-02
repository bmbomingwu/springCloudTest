package com.example.test.设计模式.行为型.Strategy.支付案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:34
 **/
// 现金支付 默认方式
public class Cash extends Payment{
    @Override
    protected String getPaymentName() {
        return "现金支付";
    }
    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}
