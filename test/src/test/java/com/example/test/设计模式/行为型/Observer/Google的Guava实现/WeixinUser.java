package com.example.test.设计模式.行为型.Observer.Google的Guava实现;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:54
 **/
@AllArgsConstructor
public class WeixinUser {
    private String name;

    @Subscribe
    public void getMessage(Object arg) {
        System.out.println(this.name + "接收到消息:" + arg);
    }
    // 测试
    public static void main(String[] args){
        // 消息总线
        EventBus eventBus = new EventBus();
        eventBus.register(new WeixinUser("张三"));
        eventBus.register(new WeixinUser("李四"));
        eventBus.post("薛之谦演唱会要来到广州啦!");
        // 返回结果
        // 张三接收到消息:薛之谦演唱会要来到广州啦!
        // 李四接收到消息:薛之谦演唱会要来到广州啦!
    }
}
