package com.itheima.demo01_operator;

/**
 * 关系运算符
 * 概述：就是用来描述变量和常量之间的关系的
 * 分类：
 * ==，！=，>, >=, <, <=
 *
 * 注意：
 * 1.不管关系表达式简单还是复杂，最终结果一定是布尔类型的数据（即：true, false）
 * 2. == 是比较， = 是赋值
 *
 * victory 2021/4/11 11:51
 */
public class OperatorDemo01 {

    public static void main(String[] args) {
        // 定义两个int类型的变量，分别赋值为10, 5, 然后通过关系运算符比较他们之间的关系
        int a = 10;
        int b = 5;
        System.out.println(a > b);  // true
        System.out.println(10 > 5); // true
        System.out.println(a > 5);  // true
        System.out.println( a >= b); // true
        System.out.println( a < b);  // false
        System.out.println( a <= b); // false
        System.out.println( a == b); // false
        System.out.println( a != b); // true
        System.out.println("---------------------");

        System.out.println(5 > 5);   // false
        System.out.println(5 >= 5);  // true
        System.out.println(a = b);   // 把变量b的值赋值给变量a, a = 5,输出 5


    }

}
