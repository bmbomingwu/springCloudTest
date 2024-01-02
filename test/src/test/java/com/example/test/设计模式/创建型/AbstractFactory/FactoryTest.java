package com.example.test.设计模式.创建型.AbstractFactory;

import org.junit.jupiter.api.Test;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:47
 **/
public class FactoryTest {


    @Test
    void factoryTest(){
        CoffeeShopFactory americanFactory = new AmericanFactory();
        System.out.println(americanFactory.createCoffee());
        System.out.println(americanFactory.createDessert());

        CoffeeShopFactory italyFactory = new ItalyFactory();
        System.out.println(italyFactory.createCoffee());
        System.out.println(italyFactory.createDessert());
    }
}
