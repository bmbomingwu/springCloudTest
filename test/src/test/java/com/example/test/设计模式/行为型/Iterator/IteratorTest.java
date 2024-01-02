package com.example.test.设计模式.行为型.Iterator;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:12
 **/
public class IteratorTest {

    public static void main(String[] args) {
        Aggregate<String>  aggregate = new AggregateImpl<>();
        aggregate.add("111");
        aggregate.add("222");
        aggregate.add("333");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
