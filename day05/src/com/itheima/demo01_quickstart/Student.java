package com.itheima.demo01_quickstart;

/**
 * 案例：描述学生类
 *
 * 1.Java语言是用来描述现实世界事物的，最基本的单位是：类
 * 2.类：是一个抽象的概念，看不见也摸不着
 * 3.对象：类的具体体现和实现
 * 4.属性：就是用来描述事物的外在特征的（即：名词），也叫成员变量，写到类中，方法外，有默认值
 * 5.行为：就是用来描述事物能够做什么（即：动词），也叫成员方法
 *
 * victory 2021/4/23 19:05
 */
public class Student {

    // 属性（成员变量）：姓名，年龄，性别
    String name;
    int age;
    String sex;

    // 行为（成员方法）：学习，吃饭，睡觉
    public void study() {
        System.out.println("好好学习，天天向上！");
    }

    public void eat() {
        System.out.println("为了保持精力，要按时吃饭！");
    }

    public void sleep() {
        System.out.println("为了保持精力，要按时睡觉！");
    }


}
