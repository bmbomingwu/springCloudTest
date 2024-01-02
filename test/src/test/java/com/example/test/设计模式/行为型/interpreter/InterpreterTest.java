package com.example.test.设计模式.行为型.interpreter;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:35
 **/
public class InterpreterTest {

    // 测试
    // PS：此处进行的逻辑仅仅实现从左到右运算，并没有先乘除后加减的逻辑
    public static void main(String[] args) {
        System.out.println(new Cal("10 + 20 - 40 * 60").cal()); // -600
        System.out.println(new Cal("20 + 50 - 60 * 2").cal()); // 20
    }
}
