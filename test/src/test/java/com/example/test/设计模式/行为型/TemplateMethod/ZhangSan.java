package com.example.test.设计模式.行为型.TemplateMethod;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:17
 **/
public class ZhangSan extends DayOffProcess {
    @Override
    protected void summit() {
        System.out.println("张三签名");
    }
    @Override
    protected void signUp() {
        System.out.println("提交到技术部审批");
    }
}
