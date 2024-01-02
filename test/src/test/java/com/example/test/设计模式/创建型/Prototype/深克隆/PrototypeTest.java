package com.example.test.设计模式.创建型.Prototype.深克隆;

/**
 * TODO
 *
 * @Description
 * @Author bomingwu
 * @Date 2023/12/28 10:54
 **/
public class PrototypeTest {

    public static void main(String[] args) throws Exception{
        Clazz clazz1 = new Clazz();
        clazz1.setName("高三一班");
        Student stu1 = new Student("张三", "男", 18);
        clazz1.setStudent(stu1);
        System.out.println(clazz1); // Clazz(name=高三一班, student=Student(name=张三, sex=男, age=18))
        Clazz clazz2 = (Clazz)clazz1.deepClone();
        Student stu2 = clazz2.getStudent();
        stu2.setName("李四");
        System.out.println(clazz1); // Clazz(name=高三一班, student=Student(name=李四, sex=男, age=18))
        System.out.println(clazz2); // Clazz(name=高三一班, student=Student(name=李四, sex=男, age=18))
    }

}
