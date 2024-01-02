package com.example.test.设计模式.结构型.Proxy.CGLIB动态代理;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 12:40
 **/
// 代售点卖票（代理类）
public class ProxyPoint implements MethodInterceptor {
    public TrainStation getProxyObject(Class<? extends TrainStation> trainStation) {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer =new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(trainStation);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象并返回
        return (TrainStation) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售火车票收取5%手续费");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("结束啦......");
        return o1;
    }
}

