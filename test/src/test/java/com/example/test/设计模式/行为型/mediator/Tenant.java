package com.example.test.设计模式.行为型.mediator;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:59
 **/
// 租客
public class Tenant extends Person {
    public Tenant(String name, MediatorCompany mediatorCompany) {
        super(name, mediatorCompany);
    }
    public void connection(String message) {
        mediatorCompany.connection(this, message);
    }
    public void getMessage(String message) {
        System.out.println("租客" + name + "获取到的信息:" + message);
    }
}
