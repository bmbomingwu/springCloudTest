package com.example.test.设计模式.行为型.State;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:21
 **/
// 开门状态
public class OpenState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门打开了");
    }
    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSE_STATE);
        super.context.close();
    }
    @Override
    public void run() {
    }
    @Override
    public void stop() {
    }
}
