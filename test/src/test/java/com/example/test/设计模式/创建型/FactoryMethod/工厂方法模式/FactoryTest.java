package com.example.test.设计模式.创建型.FactoryMethod.工厂方法模式;

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
        Coffee coffee = new CappuccinoFactory().create();
        System.out.println(coffee);
    }

}
