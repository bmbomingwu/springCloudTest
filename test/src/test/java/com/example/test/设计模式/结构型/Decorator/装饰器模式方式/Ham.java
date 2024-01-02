package com.example.test.设计模式.结构型.Decorator.装饰器模式方式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:09
 **/
// 火腿配料
public class Ham extends Ingredients {
    public Ham(FriedRice friedRice){
        super(friedRice);
    }
    String getDesc() {
        return super.getDesc() + "+火腿";
    }
    Integer getPrice() {
        return super.getPrice() + 3;
    }
}
