package com.itheima.demo07_student;

/**
 * 学生类的测试类
 *
 * victory 2021/4/24 18:14
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("刘亦菲");
        s.setAge(33);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.study();
        s.sleep();
    }
}
