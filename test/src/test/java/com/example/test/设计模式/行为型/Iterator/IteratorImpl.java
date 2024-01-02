package com.example.test.设计模式.行为型.Iterator;

import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:08
 **/
// 迭代器接口实现类
public class IteratorImpl<T> implements Iterator<T> {
    private List<T> list;
    private Integer cursor;
    private T element;

    public IteratorImpl(List<T> list) {
        this.list = list;
        this.cursor = 0;
    }
    @Override
    public Boolean hasNext() {
        return cursor < list.size();
    }
    @Override
    public T next() {
        element = list.get(cursor);
        cursor++;
        return element;
    }
}
