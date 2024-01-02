package com.example.test.设计模式.行为型.Visitor.代码实现;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:18
 **/
// 具体的访问者类,访问者角色(CEO)
public class CeoVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + "KPI为:" + engineer.getKpi());
    }
    @Override
    public void visit(Pm pm) {
        System.out.println(pm.getName() + "KPI为:" + pm.getKpi());
    }
}
