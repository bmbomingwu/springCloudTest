package com.example.test.设计模式.创建型.FactoryMethod.简单工厂模式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:30
 **/
public class CoffeeFactoryUp {

    // 使用反射创建对象
    // 加一个static变为静态工厂
    public static Coffee create(Class<? extends Coffee> clazz) throws Exception {
        if (clazz != null) {
            return clazz.newInstance();
        }
        return null;
    }
}
