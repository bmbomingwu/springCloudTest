package com.example.test.设计模式.创建型.AbstractFactory;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:43
 **/
// 咖啡店 抽象工厂
public interface CoffeeShopFactory {

    // 咖啡类
    Coffee createCoffee();

    // 甜点类
    Dessert createDessert();
}

