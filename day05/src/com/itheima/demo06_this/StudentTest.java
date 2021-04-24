package com.itheima.demo06_this;

/**
 * 学生类的测试类
 *
 * victory 2021/4/24 17:24
 */
public class StudentTest {

    public static void main(String[] args) {
        //1. 创建学生类的对象
        Student s = new Student();

        //2. 调用Student#method()
        s.method();

        System.out.println("-----------------");

        //3. 升级版演示：谁调用，this就代表谁
        Student s2 = new Student();
        s2.x = 100;
        s2.method();   // this.x -> s2.x
    }

}
