package com.itheima.demo06_this;

/**
 * 学生类，用来演示 this 关键字
 *
 * this 关键字：
 *  代表类当前对象的引用，即：谁调用，this就代表谁
 *
 *  作用：
 *  用来解决局部变量和成员变量重名的问题
 *
 *  记忆：
 *  使用变量遵循"就近原则"，局部位置有就使用，没有就去本类的成员位置找
 *  有就使用，没有就报错（这么理解不严谨，因为本类没有还会去父类中找）
 *
 * victory 2021/4/24 17:24
 */
public class Student {

    // 成员变量
    int x = 10;

    public void method() {
        // 局部变量
        int x = 20;
        System.out.println(this.x);  // 10
        System.out.println(x);       // 20
    }

}
