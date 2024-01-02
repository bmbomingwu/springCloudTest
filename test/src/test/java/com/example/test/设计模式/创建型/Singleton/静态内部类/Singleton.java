package com.example.test.设计模式.创建型.Singleton.静态内部类;

/**
 * TODO
 *
 * @Description 特点:效果类似DCL,只适用于静态域
 * @Author bomingwu
 * @Date 2023/12/28 9:33
 **/
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return SingletonHolder.INSTANCE;
    }


    public static void main(String[] args) {

            new Thread(() -> System.out.println(Singleton.getInstance())).start();
            new Thread(() -> System.out.println(Singleton.getInstance())).start();
            new Thread(() -> System.out.println(Singleton.getInstance())).start();

    }
}
