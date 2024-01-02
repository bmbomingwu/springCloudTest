package com.example.test.设计模式.创建型.Singleton.破坏单例.反射;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * TODO
 *
 * @Description 可以看到反序列化后，两个对象的地址不一样了，那么这就是违背了单例模式的原则了，
 * 解决方法只需要在单例类里加上一个readResolve()方法即可，原因就是在反序列化的过程中，
 * 会检测readResolve()方法是否存在，如果存在的话就会反射调用readResolve()这个方法。
 * @Author bomingwu
 * @Date 2023/12/28 9:44
 **/
public class Singleton implements Serializable {

    private static Singleton singleton = null;

    private Singleton() {
    }

    ;


    private static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        try {
            Singleton singleton = Singleton.getInstance();
            Class<Singleton> singletonClass = Singleton.class;
            Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton singleton1 = constructor.newInstance();
            System.out.println(singleton);
            System.out.println(singleton1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
