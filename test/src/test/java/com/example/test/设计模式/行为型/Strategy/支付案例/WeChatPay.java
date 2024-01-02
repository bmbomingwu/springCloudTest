package com.example.test.设计模式.行为型.Strategy.支付案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:36
 **/
// 微信支付类
public class WeChatPay extends Payment {
    @Override
    protected String getPaymentName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
