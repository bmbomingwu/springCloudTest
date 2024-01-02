package com.example.test.设计模式.结构型.Proxy.静态代理;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:41
 **/
public class ProxyTest {

    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        // 代售加收5%手续费
        // 广州火车站卖票啦
        proxyPoint.sellTickets();
    }
}
