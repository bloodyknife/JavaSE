package com.itheima.demo05_student;

/**
 * 学生类的测试类，用来演示标准类的定义
 *
 * victory 2021/4/24 16:40
 */
public class StudentTest {

    public static void main(String[] args) {
        // 1. 创建学生类的对象
        Student s = new Student();

        // 2. 设置属性
        s.setName("刘亦菲");
        s.setAge(33);

        // 3. 打印属性
        System.out.println(s.getName());
        System.out.println(s.getAge());

        // 4. 调用方法
        s.study();
        s.sleep();
    }

}
