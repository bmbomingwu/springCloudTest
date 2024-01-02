package com.example.test.设计模式.行为型.chainOfResponsibility.基础班;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 15:57
 **/
// 登录流程
public class LoginService {
    public void login(User user) {
        Handler validateHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();
        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(user);
    }
}
