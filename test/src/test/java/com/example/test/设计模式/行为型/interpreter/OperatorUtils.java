package com.example.test.设计模式.行为型.interpreter;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:33
 **/
// 操作工具类
public class OperatorUtils {
    // 判断是不是非终结符
    public static boolean isOperator(String symbol) {
        return symbol.equals("+") || symbol.equals("-") || symbol.equals("*")|| symbol.equals("/");
    }
    // 简单工厂
    public static NonTerminal getNonTerminal(Expression left, Expression right, String symbol) {
        if (symbol.equals("+")) {
            return new PlusNonTerminal(left, right);
        } else if (symbol.equals("-")) {
            return new MinusNonTerminal(left, right);
        } else if (symbol.equals("*")) {
            return new MclNonTerminal(left, right);
        } else if (symbol.equals("/")) {
            return new DivisionNonTerminal(left, right);
        }
        return null;
    }
}
