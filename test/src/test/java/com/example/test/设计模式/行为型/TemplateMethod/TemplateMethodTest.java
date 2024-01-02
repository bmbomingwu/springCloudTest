package com.example.test.设计模式.行为型.TemplateMethod;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:20
 **/
public class TemplateMethodTest {
    // 测试方法
    public static void main(String[] args) {
        DayOffProcess zhangsan = new ZhangSan();
        //领取申请表
        //填写申请信息
        //提交到技术部审批
        //张三签名
        //行政部备案
        zhangsan.dayOffProcess();
        DayOffProcess lisi = new Lisi();
        //领取申请表
        //填写申请信息
        //提交到市场部审批
        //李四签名
        //行政部备案
        lisi.dayOffProcess();
    }
}
