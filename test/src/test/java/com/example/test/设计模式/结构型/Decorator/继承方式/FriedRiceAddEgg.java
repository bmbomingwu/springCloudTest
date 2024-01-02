package com.example.test.设计模式.结构型.Decorator.继承方式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:04
 **/
// 炒饭加鸡蛋类
public class FriedRiceAddEgg extends FriedRice{
    String getDesc() {
        return super.getDesc() + "+鸡蛋";
    }
    Integer getPrice() {
        return super.getPrice() + 2;
    }
}