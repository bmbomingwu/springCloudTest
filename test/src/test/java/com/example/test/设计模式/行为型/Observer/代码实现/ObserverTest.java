package com.example.test.设计模式.行为型.Observer.代码实现;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:38
 **/
public class ObserverTest {
    // 测试
    public static void main(String[] args){
        Observable o = new Subject();
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("王五");
        o.add(user1);
        o.add(user2);
        o.add(user3);
        o.notify("薛之谦演唱会要来到广州啦!");
        // 运行结果
        // 张三接收到了消息(观察到了):薛之谦演唱会要来到广州啦!
        // 李四接收到了消息(观察到了):薛之谦演唱会要来到广州啦!
        // 王五接收到了消息(观察到了):薛之谦演唱会要来到广州啦!
    }
}
