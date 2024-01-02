package com.example.test.设计模式.创建型.Singleton.容器式单例;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @Description 当程序中的单例对象非常多的时候，则可以使用容器对所有单例对象进行管理，
 * @Author bomingwu
 * @Date 2023/12/28 9:58
 **/
public class ContainerSingleton {
    private ContainerSingleton() {}
    private static Map<String, Object> singletonMap = new ConcurrentHashMap<>();
    public static Object getInstance(Class clazz) throws Exception {
        String className = clazz.getName();
        // 当容器中不存在目标对象时则先生成对象再返回该对象
        if (!singletonMap.containsKey(className)) {
            synchronized (ContainerSingleton.class){
                if (!singletonMap.containsKey(className)){
                    Object instance = Class.forName(className).newInstance();
                    Thread.sleep(3000);
                    singletonMap.put(className, instance);
                    return instance;
                }
            }
            return singletonMap.get(className);
        }
        // 否则就直接返回容器里的对象
        return singletonMap.get(className);
    }
    public static void main(String[] args) throws Exception {
        new Thread(()->{
            try {
                System.out.println((Singleton)ContainerSingleton.getInstance(Singleton.class));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(()->{
            try {
                System.out.println((Singleton)ContainerSingleton.getInstance(Singleton.class));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(()->{
            try {
                System.out.println((Singleton)ContainerSingleton.getInstance(Singleton.class));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
