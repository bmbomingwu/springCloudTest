package com.example.test.设计模式.结构型.Adapter.接口适配器;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:55
 **/
// 这里例子 输出不同直流电接口
public interface DC {
    int output5();
    int output12();
    int output24();
    int output30();
}
