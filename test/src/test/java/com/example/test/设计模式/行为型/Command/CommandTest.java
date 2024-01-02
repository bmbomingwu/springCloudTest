package com.example.test.设计模式.行为型.Command;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:49
 **/
public class CommandTest {

    // 测试方法
    public static void main(String[] args) {
        // 正常播放
        new Controller().excuse(new PlayAction(new Player()));
        // 暂停播放
        new Controller().excuse(new PauseAction(new Player()));
        // 停止播放
        new Controller().excuse(new StopAction(new Player()));
    }
}
