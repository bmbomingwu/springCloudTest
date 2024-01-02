package com.example.test.设计模式.行为型.mediator;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:58
 **/
// 房主
public class HouseOwner extends Person {
    public HouseOwner(String name, MediatorCompany mediatorCompany) {
        super(name, mediatorCompany);
    }
    // 联络方法
    public void connection(String message) {
        mediatorCompany.connection(this, message);
    }
    // 获取消息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息:" + message);
    }
}
