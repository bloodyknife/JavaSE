package com.itheima.demo01_operator;

/**
 * 逻辑运算符
 * 概述：
 * 逻辑运算符一般是用来 连接 关系表达式 的，即：复合条件判断
 * 分类：
 * & 逻辑与，并且的意思，类似于and, 要求所有条件都得满足，简单记忆：有false则整体为false
 * | 逻辑或, 或者得意思，类似于or , 有true则整体为true
 * ！逻辑非, 取反得意思，类似于not， 以前是true则现在是false,以前是false现在是true
 * ^ 逻辑异或, 异同得意思，相同为false, 不同为true
 *
 * victory 2021/4/11 12:07
 */
public class OperatorDemo02 {

    public static void main(String[] args) {
        // 传统写法测试：逻辑与
        int a = 10;
        int b = 5;
        System.out.println( a > 6 & b < 6);  // true & true -> true
        System.out.println( a > 6 & b > 6);  // true & false -> false
        System.out.println("-----------------");

        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println("-----------------");


        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false & false);
        System.out.println("-------------------");

        System.out.println(!true);
        System.out.println(!false);
        System.out.println("------------------");

        // 对同一个布尔结果，偶数次取反，其值不变
        System.out.println(!!false);
        System.out.println("-------------------");

        System.out.println(true  ^ true);   // false
        System.out.println(true  ^ false);  // true
        System.out.println(false ^ true);   // true
        System.out.println(false ^ false);  // false


    }

}
