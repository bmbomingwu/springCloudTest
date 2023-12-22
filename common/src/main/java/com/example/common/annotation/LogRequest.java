package com.example.common.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/19 17:54
 **/
@Retention(RUNTIME)
@Target(METHOD)
public @interface LogRequest {

    String value() default "";
}
