package com.example.test.设计模式.行为型.interpreter;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:34
 **/
// 非终结表达式（抽象类）
@AllArgsConstructor
public abstract class NonTerminal implements Expression {
    protected Expression left;
    protected Expression right;
}
