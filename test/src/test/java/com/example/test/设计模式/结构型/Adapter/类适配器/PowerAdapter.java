package com.example.test.设计模式.结构型.Adapter.类适配器;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 13:38
 **/
// 适配器类（电源适配器）
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5() {
        int output220 = super.output();
        int output5 = output220 / 44;
        System.out.println(output220 + "V适配转换成" + output5 + "V");
        return output5;
    }
}
