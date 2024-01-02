package com.example.test.设计模式.创建型.Singleton.饿汉式;

/**
 * TODO
 *
 * @Description 特点:类加载时就初始化,线程安全
 * @Author bomingwu
 * @Date 2023/12/28 9:12
 **/
public class Singleton {

    // 构造方法私有化
    private Singleton() {}

    // 饿汉式创建单例对象
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
