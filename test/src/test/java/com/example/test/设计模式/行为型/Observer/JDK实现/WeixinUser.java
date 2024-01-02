package com.example.test.设计模式.行为型.Observer.JDK实现;

import lombok.AllArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:48
 **/
@AllArgsConstructor
public class WeixinUser implements Observer {
    private String name;
    /**
     * @param o 被观察者
     * @param arg 被观察者带过来的参数，此例子中是公众号发布的消息
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "关注了公众号(被观察者):" + ((Subject)o).getName() + ",接收到消息:" + arg);
    }
}
