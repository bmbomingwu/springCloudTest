package com.example.test.设计模式.行为型.mediator;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:58
 **/
// 抽象同事类
@AllArgsConstructor
public class Person {
    protected String name;
    protected MediatorCompany mediatorCompany;
}


