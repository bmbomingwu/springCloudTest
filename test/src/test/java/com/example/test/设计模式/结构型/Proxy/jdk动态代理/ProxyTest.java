package com.example.test.设计模式.结构型.Proxy.jdk动态代理;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:52
 **/
public class ProxyTest {

    // 测试
    public static void main(String[] args) {
        ProxyPoint proxy = new ProxyPoint();
        TrainStation guangzhouTrainStation = proxy.getProxyObject(new GuangzhouTrainStation());
        // 代售火车票收取5%手续费
        // 广州火车站卖票啦
        guangzhouTrainStation.sellTickets();
        TrainStation shenzhenTrainStation = proxy.getProxyObject(new ShenzhenTrainStation());
        // 代售火车票收取5%手续费
        // 深圳火车站卖票啦
        shenzhenTrainStation.sellTickets();
    }
}
