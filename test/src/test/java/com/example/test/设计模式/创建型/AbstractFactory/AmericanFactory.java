package com.example.test.设计模式.创建型.AbstractFactory;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:44
 **/
// 美式风格工厂
public class AmericanFactory implements CoffeeShopFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Dessert createDessert() {
        return new Cheesecake();
    }
}
