package com.example.test.设计模式.结构型.Adapter.类适配器;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:38
 **/
// 适配者 220V电压
public class AC220 {
    public int output() {
        System.out.println("输出220V交流电");
        return 220;
    }
}
