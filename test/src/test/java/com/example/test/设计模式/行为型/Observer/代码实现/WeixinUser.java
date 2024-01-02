package com.example.test.设计模式.行为型.Observer.代码实现;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:36
 **/
// 微信用户类 具体的观察者
@AllArgsConstructor
public class WeixinUser implements Observer {
    private String name;
    @Override
    public void update(String message) {
        System.out.println(name + "接收到了消息(观察到了):" + message);
    }
}
