package com.itheima.demo05_student;

/**
 * 定义学生类，用来演示“标准”的类的定义
 *
 * 实际开发中：如非必要，成员变量全部用 private修饰，其它全部用 public修饰
 *
 *
 * victory 2021/4/24 16:40
 */
public class Student {

    // 属性，成员变量，全部用 private 修饰
    private String name;
    private int age;

    // getter和setter
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    // 行为，成员方法，全部用 public 修饰
    // 学习
    public void study() {
        System.out.println("键盘敲烂，月薪过万！");
    }

    // 睡觉
    public void sleep() {
        System.out.println("为了保持精力，需要按时睡觉！");
    }

}
