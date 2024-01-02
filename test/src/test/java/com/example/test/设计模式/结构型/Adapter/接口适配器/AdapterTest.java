package com.example.test.设计模式.结构型.Adapter.接口适配器;


/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:50
 **/
public class AdapterTest {

    // 测试
    public static void main(String[] args) {
        DC powerAdapter = new PowerAdapter(new AC220());
        // 输出220V交流电
        // 220V适配转换成5V
        System.out.println(powerAdapter.output5());
        System.out.println(powerAdapter.output12());
        System.out.println(powerAdapter.output24());
    }
}
