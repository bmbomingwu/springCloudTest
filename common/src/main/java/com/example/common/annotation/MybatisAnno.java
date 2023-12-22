package com.example.common.annotation;

import io.swagger.models.auth.In;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/22 16:37
 **/
@Retention(RUNTIME)
@Target(METHOD)
public @interface MybatisAnno {

    String limit() default "0";

    int maxAge() default 0;

}
