package com.itheima.demo01_quickstart;

/**
 * 案例：学生类的测试类
 *
 * 概述：所谓的使用类，就是使用类中的成员（成员变量，成员方法）
 *
 * 格式：
 * 1. 创建该类的对象
 * 类名 对象名 = new 类名();
 * 2. 通过 对象名. 的形式来使用类中的成员
 * 对象名.成员变量
 * 对象名.成员方法
 *
 * victory 2021/4/24 09:51
 */
public class StudentTest {

    public static void main(String[] args) {
        // 需求：使用学生类中的成员
        Student stu = new Student();

        // String name = stu.name;
        // 输出默认值
        System.out.println(stu.name); // null
        System.out.println(stu.age);  // 0
        System.out.println(stu.sex);  // null

        System.out.println("----------------");

        // 给成员变量赋值
        stu.name = "刘亦菲";
        stu.age = 33;
        stu.sex = "女";

        // 再次输出，打印成员变量值
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.sex);

        System.out.println("----------------");

        // 调用成员方法
        stu.study();
        stu.eat();
        stu.sleep();

    }

}
