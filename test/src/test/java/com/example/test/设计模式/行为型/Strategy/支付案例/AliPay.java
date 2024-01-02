package com.example.test.设计模式.行为型.Strategy.支付案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:35
 **/
// 支付宝类
public class AliPay extends Payment {

    @Override
    protected String getPaymentName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
