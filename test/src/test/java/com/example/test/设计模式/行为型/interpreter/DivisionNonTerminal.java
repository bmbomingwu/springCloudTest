package com.example.test.设计模式.行为型.interpreter;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:35
 **/

// 非终结表达式（除法）
public class DivisionNonTerminal extends NonTerminal implements Expression {
    public DivisionNonTerminal(Expression left, Expression right) {
        super(left, right);
    }
    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
