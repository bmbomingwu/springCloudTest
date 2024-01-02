package com.example.test.设计模式.创建型.Singleton.双重检验锁;

/**
 * TODO
 *
 * @Description 特点:安全且在多线程情况下能保持高性能
 * @Author bomingwu
 * @Date 2023/12/28 9:28
 **/
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {};

    private static Singleton getInstance() {
        if (singleton == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Singleton.class) {
               if (singleton == null) {
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   singleton = new Singleton();
               }
           }
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
