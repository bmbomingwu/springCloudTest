package com.example.test.设计模式.行为型.chainOfResponsibility.结合建造者模式;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 16:05
 **/
public class LoginService {

    public void login(User user) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(user);
    }
}
