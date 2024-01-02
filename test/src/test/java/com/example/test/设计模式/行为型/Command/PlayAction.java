package com.example.test.设计模式.行为型.Command;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:48
 **/
// 播放命令类
@AllArgsConstructor
public class PlayAction implements IAction {
    private Player player;
    @Override
    public void excuse() {
        this.player.play();
    }
}
