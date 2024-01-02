package com.example.test.设计模式.行为型.chainOfResponsibility.基础班;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:56
 **/
// handler抽象类
public abstract class Handler {
    protected Handler next;
    // 返回handler方便链式操作
    public void next(Handler next) {
        this.next = next;
    }
    // 流程开始的方法
    public abstract void doHandler(User user);
}
