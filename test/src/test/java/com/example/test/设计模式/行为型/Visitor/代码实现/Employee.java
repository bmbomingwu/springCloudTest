package com.example.test.设计模式.行为型.Visitor.代码实现;

import lombok.Data;

import java.util.Random;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:19
 **/
@Data
// 抽象元素(员工)
public abstract class Employee {
    private String name;
    private Integer kpi;
    public Employee(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }
    public abstract void accept(IVisitor visitor);
}
