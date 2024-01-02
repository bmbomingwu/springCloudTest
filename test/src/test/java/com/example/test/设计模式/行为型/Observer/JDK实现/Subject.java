package com.example.test.设计模式.行为型.Observer.JDK实现;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:46
 **/
// 具体的被观察者(公众号)
@Data
@AllArgsConstructor
public class Subject extends Observable {
    // 公众号的名字
    private String name;
    // 公众号发布消息
    public void notifyMessage(String message) {
        System.out.println(this.name + "公众号发布消息:" + message + "请关注用户留意接收!");
        super.setChanged();
        super.notifyObservers(message);
    }
}


