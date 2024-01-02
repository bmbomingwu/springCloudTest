package com.example.test.设计模式.结构型.Proxy.jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 11:51
 **/
// 代售点卖票（代理类）
public class ProxyPoint implements InvocationHandler {
    private TrainStation trainStation;
    public TrainStation getProxyObject(TrainStation trainStation) {
        this.trainStation = trainStation;
        Class<? extends TrainStation> clazz = trainStation.getClass();
        return (TrainStation) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代售火车票收取5%手续费");
        return method.invoke(this.trainStation, args);
    }
}
