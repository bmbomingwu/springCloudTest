package com.example.test.设计模式.行为型.Visitor.代码实现;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:18
 **/
// 具体的访问者类,访问者角色(CTO)
public class CtoVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + "工作内容:" + engineer.getCodeLine() + "行代码");
    }
    @Override
    public void visit(Pm pm) {
        System.out.println(pm.getName() + "工作内容:" + pm.getProject() + "个项目");
    }
}
