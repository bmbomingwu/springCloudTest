package com.example.test.设计模式.结构型.Decorator.继承方式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:05
 **/
public class DecoratorTest {

    // 测试方法
    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + friedRice.getPrice() + "元");// 炒饭5元
        FriedRice friedRiceAddEgg = new FriedRiceAddEgg();
        System.out.println(friedRiceAddEgg.getDesc() + friedRiceAddEgg.getPrice() + "元"); // 炒饭+鸡蛋7元
        FriedRice friedRiceAddEggAndHam = new FriedRiceAddEggAndHam();
        System.out.println(friedRiceAddEggAndHam.getDesc() + friedRiceAddEggAndHam.getPrice() + "元");// 炒饭+鸡蛋+火腿10元
    }
}
