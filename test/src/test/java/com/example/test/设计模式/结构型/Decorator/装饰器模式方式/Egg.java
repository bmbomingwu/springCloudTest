package com.example.test.设计模式.结构型.Decorator.装饰器模式方式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:09
 **/
// 鸡蛋配料
public class Egg extends Ingredients {
    public Egg(FriedRice friedRice) {
        super(friedRice);
    }
    String getDesc() {
        return super.getDesc() + "+鸡蛋";
    }
    Integer getPrice() {
        return super.getPrice() + 2;
    }
}
