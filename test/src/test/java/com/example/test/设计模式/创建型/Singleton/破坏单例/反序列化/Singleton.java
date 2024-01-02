package com.example.test.设计模式.创建型.Singleton.破坏单例.反序列化;

import java.io.*;

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

    private Singleton(){};

    //解决反序列化
    private Object readResolve() {
        return singleton;
    }

    private static Singleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton ==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        new Thread(()->{
            try {
            Singleton singleton = Singleton.getInstance();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/test.txt"));
            oos.writeObject(singleton);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/test.txt"));
            Singleton singleton1 = (Singleton)ois.readObject();
            ois.close();
            System.out.println(singleton);//com.example.test.设计模式.创建型.Singleton.破坏单例.反序列化.Singleton@573fd745
            System.out.println(singleton1);//com.example.test.设计模式.创建型.Singleton.破坏单例.反序列化.Singleton@3b22cdd0
        }catch (Exception e){
            System.out.println(e);
        }}).start();


    }
}
