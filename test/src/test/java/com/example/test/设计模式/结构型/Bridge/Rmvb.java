package com.example.test.设计模式.结构型.Bridge;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 14:23
 **/
// RMVB格式类
public class Rmvb implements Video{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件：" + fileName);
    }
}
