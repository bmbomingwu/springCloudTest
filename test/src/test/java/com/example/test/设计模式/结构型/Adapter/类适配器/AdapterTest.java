package com.example.test.设计模式.结构型.Adapter.类适配器;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:39
 **/
public class AdapterTest {

    // 测试
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        // 输出220V交流电
        powerAdapter.output();
        // 输出220V交流电
        // 220V适配转换成5V
        powerAdapter.output5();
    }
}
