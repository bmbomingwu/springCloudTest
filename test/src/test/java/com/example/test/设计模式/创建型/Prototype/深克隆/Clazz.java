package com.example.test.设计模式.创建型.Prototype.深克隆;

import lombok.Data;

import java.io.*;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:52
 **/
@Data
public class Clazz implements Cloneable,Serializable {
    private String name;
    private Student student;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}


