package com.example.test.设计模式.创建型.FactoryMethod.简单工厂模式;

import org.junit.jupiter.api.Test;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:28
 **/
public class FactoryTest {

    @Test
    void factoryTest(){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        System.out.println(coffeeFactory.create("americano"));
        System.out.println(coffeeFactory.create("mocha"));
        System.out.println(coffeeFactory.create("cappuccino"));
    }


    @Test
    void factoryUpTest() throws Exception {
        System.out.println(CoffeeFactoryUp.create(Americano.class));
        System.out.println(CoffeeFactoryUp.create(Cappuccino.class));
        System.out.println(CoffeeFactoryUp.create(Mocha.class));
    }
}
