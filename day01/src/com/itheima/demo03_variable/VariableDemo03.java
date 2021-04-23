package com.itheima.demo03_variable;

/**
 * 变量的注意事项
 *
 * 1. 变量未赋值，不能使用
 * 2. 变量只在它所属范围内有效
 * 3. 一行可以定义多个变量（不建议）
 *
 * victory 2021/4/8 12:32
 */
public class VariableDemo03 {

    public static void main(String[] args) {

        // 变量未赋值，不能使用
        // int a;
        // System.out.println(a);

        // 变量abc不能在别的类中使用
        // int abc = 10;
        // System.out.println(abc);

        // 一行可以定义多个变量（不建议）
        int x = 10, y = 20, z = 30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

}
