package com.example.test.设计模式.结构型.Adapter.对象适配器;

import lombok.AllArgsConstructor;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:49
 **/
@AllArgsConstructor
public class PowerAdapter implements DC5 {

    // 适配者
    private Power power;
    @Override
    public int output5() {
        int output220 = power.output();
        int output5 = output220 / 44;
        System.out.println(output220 + "V适配转换成" + output5 + "V");
        return output5;
    }
}
