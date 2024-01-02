package com.example.test.设计模式.行为型.interpreter;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:33
 **/
// 非终结表达式（加法）
public class PlusNonTerminal extends NonTerminal implements Expression {
    public PlusNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
