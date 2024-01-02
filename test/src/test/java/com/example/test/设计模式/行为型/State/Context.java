package com.example.test.设计模式.行为型.State;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:21
 **/
// 上下文
public class Context {
    private LiftState liftState;
    public static final LiftState OPEN_STATE = new OpenState();
    public static final LiftState CLOSE_STATE = new CloseState();
    public static final LiftState RUN_STATE = new RunState();
    public static final LiftState STOP_STATE = new StopState();
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }
    public void open() {
        this.liftState.open();
    }
    public void close() {
        this.liftState.close();
    }
    public void run() {
        this.liftState.run();
    }
    public void stop() {
        this.liftState.stop();
    }
}
