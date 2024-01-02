package com.example.test.设计模式.行为型.interpreter;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:34
 **/
// 非终结表达式（减法）
public class MinusNonTerminal extends NonTerminal implements Expression {
    public MinusNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
