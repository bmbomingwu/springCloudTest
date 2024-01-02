package com.example.test.设计模式.行为型.chainOfResponsibility.基础班;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:56
 **/
// 权限校验
public class AuthHandler extends Handler {
    @Override
    public void doHandler(User user) {
        if (!"admin".equals(user.getRole())) {
            System.out.println("无权限操作!");
            return;
        }
        System.out.println("角色为管理员,可以进行下一步操作!");
    }
}
