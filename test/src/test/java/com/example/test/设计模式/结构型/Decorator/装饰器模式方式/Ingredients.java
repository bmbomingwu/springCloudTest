package com.example.test.设计模式.结构型.Decorator.装饰器模式方式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:08
 **/
// 配料表
public abstract class Ingredients extends FriedRice{
    private FriedRice friedRice;
    public Ingredients(FriedRice friedRice) {
        this.friedRice = friedRice;
    }
    String getDesc() {
        return this.friedRice.getDesc();
    }
    Integer getPrice() {
        return this.friedRice.getPrice();
    }
}
