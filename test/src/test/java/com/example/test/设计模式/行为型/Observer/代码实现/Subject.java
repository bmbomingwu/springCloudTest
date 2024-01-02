package com.example.test.设计模式.行为型.Observer.代码实现;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:36
 **/
// 具体的被观察者(公众号)
public class Subject implements Observable {
    // 观察者列表(订阅用户)
    private List<Observer> list = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        list.add(observer);
    }
    @Override
    public void del(Observer observer) {
        list.remove(observer);
    }
    // 给每一个观察者(订阅者)推送消息
    @Override
    public void notify(String message) {
        list.forEach(observer -> observer.update(message));
    }

}