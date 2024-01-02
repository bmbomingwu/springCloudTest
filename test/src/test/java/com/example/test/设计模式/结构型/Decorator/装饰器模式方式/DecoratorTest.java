package com.example.test.设计模式.结构型.Decorator.装饰器模式方式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:10
 **/
public class DecoratorTest {


    // 测试方法
    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + friedRice.getPrice() + "元"); // 炒饭5元
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + friedRice.getPrice() + "元"); // 炒饭+鸡蛋7元
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + friedRice.getPrice() + "元");// 炒饭+鸡蛋+鸡蛋9元
        friedRice = new Ham(friedRice);
        System.out.println(friedRice.getDesc() + friedRice.getPrice() + "元");// 炒饭+鸡蛋+鸡蛋+火腿12元
    }
}
