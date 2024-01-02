package com.example.test.设计模式.行为型.Strategy.支付案例;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:34
 **/
// 支付方式抽象类
public abstract class Payment {
    public String pay(String uid, double money) {
        double balance = queryBalance(uid);
        if (balance < money) {
            return "支付失败!余额不足!欠" + (money - balance) + "元!";
        }
        return "支付成功!支付金额:" + money + "余额剩余:" + (balance - money);
    }
    protected abstract String getPaymentName();
    protected abstract double queryBalance(String uid);
}
