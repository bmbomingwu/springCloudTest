package com.example.test.设计模式.结构型.Adapter.接口适配器;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:55
 **/

// 适配器类（电源适配器）
@AllArgsConstructor
public class PowerAdapter implements DC {
    private Power power;

    @Override
    public int output5() {
        // 具体实现逻辑
        return 5;
    }

    @Override
    public int output12() {
        // 具体实现逻辑
        return 12;
    }

    @Override
    public int output24() {
        // 具体实现逻辑
        return 24;
    }

    @Override
    public int output30() {
        // 具体实现逻辑
        return 30;
    }
}
