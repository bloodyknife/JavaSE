package com.itheima.demo01_operator;

/**
 * 短路逻辑运算符
 *
 * &&: 短路与，用法逻辑与&一样，也是有false则整体为false,区别在于它能发生短路效应，前边出现false, 后边不执行
 * ||: 短路或，用法逻辑或|一样，也是有true则整体为true,区别在于它能发生短路效应，前边出现true, 后边不执行
 *
 * 结论：
 * 关于逻辑运算符我们经常使用：&&, ||, !
 *
 * victory 2021/4/11 12:07
 */
public class OperatorDemo03 {

    public static void main(String[] args) {

        // 定义两个int类型得变量 a和b, 初始化值分别为 2, 5
        int a = 2, b =5;
        int c = 2, d =5;

        // 演示逻辑与
        System.out.println((a++ >2)&(b++ <7));
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------");
        // 演示短路与
        System.out.println((c++ >2)&(b++ <7));
        System.out.println(c);
        System.out.println(d);

        // 短路或 和 逻辑或

    }

}
