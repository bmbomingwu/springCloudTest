package com.example.test.设计模式.创建型.FactoryMethod.工厂方法模式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:37
 **/
public class CappuccinoFactory implements CoffeeFactory{
    @Override
    public Coffee create() {
        return new Cappuccino();
    }
}
