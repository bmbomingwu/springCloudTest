package com.example.test.设计模式.行为型.TemplateMethod;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:18
 **/
public class Lisi extends DayOffProcess {
    @Override
    protected void summit() {
        System.out.println("李四签名");
    }
    @Override
    protected void signUp() {
        System.out.println("提交到市场部审批");
    }
}
