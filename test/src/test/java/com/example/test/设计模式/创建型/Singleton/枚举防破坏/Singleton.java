package com.example.test.设计模式.创建型.Singleton.枚举防破坏;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 9:38
 **/
public enum Singleton {
    INSTANCE;

    public static void main(String[] args) {
        new Thread(()-> System.out.println(Singleton.INSTANCE));
        new Thread(()-> System.out.println(Singleton.INSTANCE));
        new Thread(()-> System.out.println(Singleton.INSTANCE));
    }
}
