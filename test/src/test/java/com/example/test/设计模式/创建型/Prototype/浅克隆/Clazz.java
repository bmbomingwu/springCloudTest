package com.example.test.设计模式.创建型.Prototype.浅克隆;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:52
 **/
@Data
public class Clazz implements Cloneable {
    private String name;
    private Student student;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


