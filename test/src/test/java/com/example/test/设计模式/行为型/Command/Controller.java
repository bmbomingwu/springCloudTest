package com.example.test.设计模式.行为型.Command;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:47
 **/
// 控制器
public class Controller {
    public void excuse(IAction action) {
        action.excuse();
    }
}
