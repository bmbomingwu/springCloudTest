package com.example.test.设计模式.结构型.Flyweight;

import static com.example.test.设计模式.结构型.Flyweight.TicketFactory.getTicket;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:03
 **/
public class Flyweight {

    // 测试
    public static void main(String[] args) {
        ITicket ticket = getTicket("北京", "上海");
        //使用数据库获取火车票:北京->上海
        //北京->上海:二等座价格:20
        ticket.show("二等座");
        ITicket ticket1 = getTicket("北京", "上海");
        //使用缓存获取火车票:北京->上海
        //北京->上海:商务座价格:69
        ticket1.show("商务座");
        ITicket ticket2 = getTicket("上海", "北京");
        //使用数据库获取火车票:上海->北京
        //上海->北京:一等座价格:406
        ticket2.show("一等座");
        System.out.println(ticket == ticket1);//true
        System.out.println(ticket == ticket2);//false
    }
}
