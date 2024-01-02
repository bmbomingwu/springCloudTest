package com.example.test.设计模式.行为型.chainOfResponsibility.结合建造者模式;



/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:57
 **/
// 登录校验，校验用户名是否匹配密码
public class LoginHandler extends Handler {
    @Override
    public void doHandler(User user) {
        if (!"pyy52hz".equals(user.getUsername()) || !"123456".equals(user.getPassword())) {
            System.out.println("用户名或者密码不正确!请检查!");
            return;
        }
        user.setRole("admin");
        System.out.println("登陆成功!角色为管理员!");
        next.doHandler(user);
    }
}
