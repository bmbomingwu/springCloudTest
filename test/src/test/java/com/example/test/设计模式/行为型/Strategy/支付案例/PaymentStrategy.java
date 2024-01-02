package com.example.test.设计模式.行为型.Strategy.支付案例;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:37
 **/
// 支付方式容器策略类
public class PaymentStrategy {
    private static Map<String, Payment> map = new ConcurrentHashMap<>();
    static {
        map.put("WeChat", new WeChatPay());
        map.put("Ali", new AliPay());
    }
    public static Payment getPayment(String payment) {
        return map.get(payment) == null ? new Cash() : map.get(payment);
    }

}
