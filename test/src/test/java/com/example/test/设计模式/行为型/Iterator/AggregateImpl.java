package com.example.test.设计模式.行为型.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:09
 **/
// 容器接口实现类
public class AggregateImpl<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();
    @Override
    public void add(T t) {
        list.add(t);
    }
    @Override
    public void remove(T t) {
        list.remove(t);
    }
    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl<>(list);
    }
}
