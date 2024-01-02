package com.example.test.设计模式.行为型.State;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:23
 **/
// 停止状态
public class StopState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_STATE);
        super.context.open();
    }
    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSE_STATE);
        super.context.close();
    }
    @Override
    public void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.run();
    }
    @Override
    public void stop() {
        System.out.println("电梯停止了!");
    }
}
