package com.example.test.设计模式.行为型.Observer.代码实现;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:37
 **/

// 被观察者接口
public interface Observable {
    // 新增用户(新增观察者)
    void add(Observer observer);
    // 移除用户,或者说用户取消订阅(移除观察者)
    void del(Observer observer);
    // 发布 推送消息
    void notify(String message);
}
