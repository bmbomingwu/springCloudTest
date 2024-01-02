package com.example.test.设计模式.行为型.Observer.JDK实现;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:49
 **/
public class ObserverTest {

    // 测试
    public static void main(String[] args){
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("王五");
        Subject subject = new Subject("演唱会消息发布");
        subject.addObserver(user1);
        subject.addObserver(user2);
        subject.addObserver(user3);
        subject.notifyMessage("薛之谦演唱会要来到广州啦!");
        // 返回结果
        // 演唱会消息发布公众号发布消息:薛之谦演唱会要来到广州啦!请关注用户留意接收!
        // 王五关注了公众号(被观察者):演唱会消息发布,接收到消息:薛之谦演唱会要来到广州啦!
        // 李四关注了公众号(被观察者):演唱会消息发布,接收到消息:薛之谦演唱会要来到广州啦!
        // 张三关注了公众号(被观察者):演唱会消息发布,接收到消息:薛之谦演唱会要来到广州啦!
    }
}
