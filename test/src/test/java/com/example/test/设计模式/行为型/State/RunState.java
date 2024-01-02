package com.example.test.设计模式.行为型.State;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:22
 **/
// 运行状态
public class RunState extends LiftState {
    @Override
    public void open() {
    }
    @Override
    public void close() {
    }
    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_STATE);
        super.context.stop();
    }
}
