package com.example.test.设计模式.创建型.Singleton.懒汉式;

/**
 * TODO
 *
 * @Description 特点:第一次调用才初始化，避免内存浪费。
 * @Author bomingwu
 * @Date 2023/12/28 9:16
 **/
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {};

    private static Singleton getInstance() {
        if (singleton == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
       /* System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());*/

            new Thread(() -> System.out.println(Singleton.getInstance())).start();
            new Thread(() -> System.out.println(Singleton.getInstance())).start();
            new Thread(() -> System.out.println(Singleton.getInstance())).start();


    }
}
