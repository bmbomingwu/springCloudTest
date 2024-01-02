package com.example.test.设计模式.行为型.TemplateMethod;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:15
 **/
public abstract class DayOffProcess {
    // 请假模板
    public final void dayOffProcess() {
        // 领取申请表
        this.pickUpForm();
        // 填写申请信息
        this.writeInfo();
        // 签名
        this.signUp();
        // 提交到不同部门审批
        this.summit();
        // 行政部备案
        this.filing();
    }
    private void filing() {
        System.out.println("行政部备案");
    }
    protected abstract void summit();
    protected abstract void signUp();
    private void writeInfo() {
        System.out.println("填写申请信息");
    }
    private void pickUpForm() {
        System.out.println("领取申请表");
    }
}



