package com.example.test.设计模式.行为型.chainOfResponsibility.基础班;

import org.apache.commons.lang3.StringUtils;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:58
 **/

// 校验用户名或者密码是否为空
public class ValidateHandler extends Handler {
    @Override
    public void doHandler(User user) {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            System.out.println("用户名或者密码为空!");
            return;
        }
        System.out.println("校验通过");
        next.doHandler(user);
    }
}
