package com.example.test.设计模式.行为型.State;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:23
 **/
public class StateTest {

    // 测试
    public static void main(String[] args){
        Context context = new Context();
        context.setLiftState(new CloseState());
        //电梯门打开了
        //电梯门关闭了!
        //电梯正在运行...
        //电梯停止了!
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
