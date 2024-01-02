package com.example.test.设计模式.行为型.Visitor.代码实现;

import java.util.Random;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:20
 **/
// 具体元素(项目经理)
public class Pm extends Employee {
    public Pm(String name) {
        super(name);
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public Integer getProject() {
        return new Random().nextInt(10);
    }
}
