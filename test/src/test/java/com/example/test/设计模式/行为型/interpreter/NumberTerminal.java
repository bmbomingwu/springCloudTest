package com.example.test.设计模式.行为型.interpreter;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:33
 **/
@AllArgsConstructor
public class NumberTerminal implements Expression {
    private int number;
    @Override
    public int interpret() {
        return this.number;
    }
}
