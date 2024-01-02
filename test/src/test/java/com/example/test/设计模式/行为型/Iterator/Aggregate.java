package com.example.test.设计模式.行为型.Iterator;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:09
 **/
// 容器接口
public interface Aggregate<T> {
    void add(T t);
    void remove(T t);
    Iterator<T> iterator();
}