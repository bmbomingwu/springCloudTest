package com.example.test.设计模式.结构型.Bridge;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:22
 **/
// 操作系统抽象类
@AllArgsConstructor
public abstract class OperatingSystem {
    Video video;
    public abstract void play(String fileName);

}