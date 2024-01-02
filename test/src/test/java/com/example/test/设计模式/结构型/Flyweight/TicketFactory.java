package com.example.test.设计模式.结构型.Flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:02
 **/
// 工厂类
public class TicketFactory {
    private static Map<String, ITicket> pool = new ConcurrentHashMap<>();
    public static ITicket getTicket(String from, String to) {
        String key = from + "->" + to;
        if (pool.containsKey(key)) {
            System.out.println("使用缓存获取火车票:" + key);
            return pool.get(key);
        }
        System.out.println("使用数据库获取火车票:" + key);
        ITicket ticket = new TrainTicket(from, to);
        pool.put(key, ticket);
        return ticket;
    }
}
