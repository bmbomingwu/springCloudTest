package com.example.test.设计模式.行为型.interpreter;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:35
 **/

// 计算器类（实现运算逻辑）
public class Cal {
    private Expression left;
    private Expression right;
    private Integer result;
    public Cal(String expression) {
        this.parse(expression);
    }
    private Integer parse(String expression) {
        // 获取表达式元素
        String [] elements = expression.split(" ");
        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];
            // 判断是否是运算符号
            if (OperatorUtils.isOperator(element)) {
                // 运算符号的右边就是右终结符
                right = new NumberTerminal(Integer.valueOf(elements[++i]));
                //计算结果
                result = OperatorUtils.getNonTerminal(left, right, element).interpret();
                // 计算结果重新成为左终结符
                left = new NumberTerminal(result);
            } else {
                left = new NumberTerminal(Integer.valueOf(element));
            }
        }
        return result;
    }
    public Integer cal() {
        return result;
    }

}
