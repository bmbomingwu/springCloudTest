package com.example.test.设计模式.结构型.Proxy.静态代理;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:40
 **/
// 代售点卖票（代理类）
public class ProxyPoint implements TrainStation {
    // 目标对象（代理火车站售票）
    private TrainStation station = new GuangzhouTrainStation();
    @Override
    public void sellTickets() {
        System.out.println("代售加收5%手续费");
        station.sellTickets();
        System.out.println("结束啦........");
    }

}
