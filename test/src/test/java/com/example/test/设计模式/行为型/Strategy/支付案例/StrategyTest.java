package com.example.test.设计模式.行为型.Strategy.支付案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:37
 **/
public class StrategyTest {

    // 测试方法
    public static void main(String[] args) {
        Order order = new Order("20221014001", 500);
        //欢迎使用微信支付
        //本次交易金额:500.0,开始扣款...
        //支付失败!余额不足!欠200.0元!
        System.out.println(order.pay("WeChat"));
        //欢迎使用支付宝
        //本次交易金额:500.0,开始扣款...
        //支付成功!支付金额:500.0余额剩余:0.0
        System.out.println(order.pay("Ali"));
        //欢迎使用现金支付
        //本次交易金额:500.0,开始扣款...
        //支付成功!支付金额:500.0余额剩余:500.0
        System.out.println(order.pay());
    }
}
