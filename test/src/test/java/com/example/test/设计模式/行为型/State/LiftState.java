package com.example.test.设计模式.行为型.State;

import lombok.Data;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:20
 **/
// 电梯状态
@Data
public abstract class LiftState {
    protected Context context;
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}





