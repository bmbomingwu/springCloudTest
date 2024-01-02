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
 * @Date 2023/12/28 10:53
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private String name;
    private String sex;
    private Integer age;
}
