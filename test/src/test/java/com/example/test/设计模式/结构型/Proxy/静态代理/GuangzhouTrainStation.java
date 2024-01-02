package com.example.test.设计模式.结构型.Proxy.静态代理;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:40
 **/
// 广州火车站卖票
public class GuangzhouTrainStation implements TrainStation {
    @Override
    public void sellTickets() {
        System.out.println("广州火车站卖票啦");
    }
}
