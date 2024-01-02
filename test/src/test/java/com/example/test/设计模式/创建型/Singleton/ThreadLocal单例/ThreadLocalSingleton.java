package com.example.test.设计模式.创建型.Singleton.ThreadLocal单例;

/**
 * TODO
 *
 * @Description 不保证整个应用全局唯一，但保证线程内部全局唯一，以空间换时间，且线程安全。
 * @Author bomingwu
 * @Date 2023/12/28 10:18
 **/
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "-----" + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + "-----" + ThreadLocalSingleton.getInstance());
        }).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "-----" + ThreadLocalSingleton.getInstance());
            System.out.println(Thread.currentThread().getName() + "-----" + ThreadLocalSingleton.getInstance());
        }).start();
    }
}
