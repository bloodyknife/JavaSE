package com.itheima.demo04_student;

/**
 * 学生类的测试类
 *
 * private关键字：
 * 它是一个权限修饰符，可以修饰类的成员（成员变量，成员方法）
 *
 * 特点：
 * 被它修饰的内容，只能在本类中直接使用
 *
 * 结论：
 * 1. 封装就是隐藏对象的属性和实现细节，仅对外提供一个公共的访问方式
 *
 * victory 2021/4/24 16:17
 */
public class StudentTest {

    public static void main(String[] args) {
        // 1.创建学生类的对象
        Student s = new Student();

        // 2.设置成员变量值
        s.name = "刘亦菲";
        /*
        * 下述代码，用户可以直接访问 age 成员变量的，这样做比较危险
        * 因为用户可以给该变量设置一些非法值，这样我们的程序就有可能出问题
        * 针对于这种情况，我们可以通过 private 关键字解决
        *
        * 当我们给类的成员变量加上private修饰后，我们发现一个新问题：
        * 外界居然无法直接访问 被private修饰的变量了，该如何解决？
        *   只需要对外提供一个公共的访问方式即可，让用户可以操作变量
        *   1. 可以设置变量的值
        *   2. 可以获取变量的值
        * */
        // s.age = 33;
        // 以下为：采用封装后的代码
        // 设置年龄
        s.setAge(33);
        // 获取年龄
        System.out.println(s.getAge());


        // 3.打印成员变量值
        /*System.out.println(s.name);
        System.out.println(s.age);*/

        // System.out.println(s); // 打印地址值

        s.show();
    }


}
