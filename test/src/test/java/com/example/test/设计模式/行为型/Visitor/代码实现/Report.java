package com.example.test.设计模式.行为型.Visitor.代码实现;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:20
 **/
@AllArgsConstructor
public class Report {
    private List<Employee> employeeList;
    public void showReport(IVisitor visitor) {
        for (Employee employee : employeeList) {
            employee.accept(visitor);
        }
    }
}