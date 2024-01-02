package com.example.test.设计模式.创建型.AbstractFactory;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:45
 **/
// 意式风格工厂
public class ItalyFactory implements CoffeeShopFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}