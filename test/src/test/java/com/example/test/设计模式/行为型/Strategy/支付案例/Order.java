package com.example.test.设计模式.行为型.Strategy.支付案例;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:35
 **/
// 订单交易类
@AllArgsConstructor
public class Order {
    private String uid;
    private double amount;
    public String pay() {
        return pay("cash");
    }
    public String pay(String key) {
        Payment payment = PaymentStrategy.getPayment(key);
        System.out.println("欢迎使用" + payment.getPaymentName());
        System.out.println("本次交易金额:" + this.amount + ",开始扣款...");
        return payment.pay(this.uid, this.amount);
    }
}
