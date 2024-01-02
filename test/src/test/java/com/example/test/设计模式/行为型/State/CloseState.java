package com.example.test.设计模式.行为型.State;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:22
 **/
// 关门状态
public class CloseState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_STATE);
        super.context.open();
    }
    @Override
    public void close() {
        System.out.println("电梯门关闭了!");
    }
    @Override
    public void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.run();
    }
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_STATE);
        super.context.stop();
    }
}
