package com.itheima.demo04_student;

/**
 * 定义学生类（JavaBean类，实体类，POJO类）
 * victory 2021/4/24 16:17
 */
public class Student {

    // 属性，也叫成员变量，名词
    String name;
    private int age;

    // 针对于被private修饰的变量，需要对外提供一个公共的访问方式
    // 设置变量age的值
    public void setAge(int a) {
        // 针对于用户录入的值 a,我们可以判断
        if (a >= 0 && a <= 200) {
            // 合法年龄，就设置
            age = a;
        }
    }

    // 获取变量age的值
    public int getAge() {
        return age;
    }

    // 行为，也叫成员方法，动词
    public void show() {
        System.out.println(name + "...." + age);
    }

}
