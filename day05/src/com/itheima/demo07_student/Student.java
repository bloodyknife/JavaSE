package com.itheima.demo07_student;

/**
 * 定义学生类，用来演示“标准版的JavaBean类的编写”
 *
 * victory 2021/4/24 18:14
 */
public class Student {

    // 属性，成员变量，全部私有
    private String name;
    private int age;

    // getter和setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;  // 就近原则，局部没有，就去本类中的成员位置找，所以this可以省略
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 行为，成员方法
    public void study() {
        System.out.println("键盘敲烂，月薪过万...");
    }

    public void sleep() {
        System.out.println("为了保持精力，一定要保证充足的睡眠...");
    }

}
