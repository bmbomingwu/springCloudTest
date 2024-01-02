package com.example.test.设计模式.行为型.Visitor.代码实现;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 17:21
 **/
public class VisitorTest {


    // 测试
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Engineer("工程师A"));
        employeeList.add(new Engineer("工程师B"));
        employeeList.add(new Pm("项目经理A"));
        employeeList.add(new Engineer("工程师C"));
        employeeList.add(new Engineer("工程师D"));
        employeeList.add(new Pm("项目经理B"));
        Report report = new Report(employeeList);
        System.out.println("=============CEO==============");
        report.showReport(new CeoVisitor());
        System.out.println("=============CTO==============");
        report.showReport(new CtoVisitor());
        // =============CEO==============
        // 工程师AKPI为:2
        // 工程师BKPI为:4
        // 项目经理AKPI为:4
        // 工程师CKPI为:2
        // 工程师DKPI为:0
        // 项目经理BKPI为:0
        // =============CTO==============
        // 工程师A工作内容:5811行代码
        // 工程师B工作内容:9930行代码
        // 项目经理A工作内容:7个项目
        // 工程师C工作内容:4591行代码
        // 工程师D工作内容:333行代码
        // 项目经理B工作内容:4个项目
    }
}
