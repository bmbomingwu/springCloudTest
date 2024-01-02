package com.example.test.设计模式.结构型.Facade;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:40
 **/
public class FacadeTest {

    public static void main(String[] args) {
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        //睡觉
        //关灯
        //关电视
        //开风扇
        smartSpeaker.say("我要睡觉了!");
        //起床
        //开灯
        //开电视
        //关风扇
        smartSpeaker.say("我起床了!");
        //我还听不懂你说的啥！
        smartSpeaker.say("Emmm");
    }
}
