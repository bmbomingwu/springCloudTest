package com.example.test.设计模式.行为型.Visitor.代码实现;

import java.util.Random;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:19
 **/
// 具体元素(程序员)
public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
    public Integer getCodeLine() {
        return new Random().nextInt(10000);
    }
}
