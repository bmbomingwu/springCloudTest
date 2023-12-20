package com.example.test.config;

import com.example.test.interceptor.ExceptionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 17:05
 **/
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {

    // 将自定义的拦截器注入
    @Resource
    private ExceptionInterceptor exceptionInterceptor;

    /**
     * @param registry 注册对象
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 注册对象将拦截器添加进框架中
        registry.addInterceptor(exceptionInterceptor)
                // 配置拦截规则
                .addPathPatterns("/**") // 拦截所有的 url
                .excludePathPatterns("/user/reg") // 排除用户注册 url
                .excludePathPatterns("/user/login") // 排除用户登陆 url
                .excludePathPatterns("/image/**"); // 排除 image 文件夹底下的所有文件
    }
}

