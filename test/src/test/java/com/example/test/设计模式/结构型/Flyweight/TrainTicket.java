package com.example.test.设计模式.结构型.Flyweight;

import java.util.Random;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:01
 **/
public class TrainTicket implements ITicket {
    private String from;
    private String to;
    private Integer price;
    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }
    @Override
    public void show(String seat) {
        this.price = new Random().nextInt(500);
        System.out.println(from + "->" + to + ":" + seat + "价格:" + this.price);
    }
}
