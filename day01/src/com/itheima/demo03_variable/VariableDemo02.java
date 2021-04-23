package com.itheima.demo03_variable;

/**
 * Java中数据类型：
 * 基本数据类型（四类/八种）：
 * 整型：
 * byte    1字节     -128~127
 * short   2字节
 * int     4字节
 * long    8字节
 * 浮点型
 * float   4字节
 * double  8字节
 * 字符型
 * char    2字节     0~65535
 * 布尔型
 * boolean 1字节
 *
 * 引用数据类型：
 *  字符串类型：String
 *  自定义的类
 *  自定义的接口
 *  数组
 *
 * victory 2021/4/8 12:32
 */
public class VariableDemo02 {

    public static void main(String[] args) {
        // byte
        // 方式一：直接初始化变量 (初始化 = 声明 + 赋值)
        byte a = 10;

        // 方式二：先声明，后赋值
        byte a2;
        a2 = 20;

        System.out.println(a);
        System.out.println(a2);
        System.out.println("------------------");

        // short
        short s = 10;
        System.out.println(s);
        System.out.println("------------------");

        // int
        int a3 = 30;
        System.out.println(a3);
        System.out.println("------------------");

        // long
        long a4 = 4000000000000000000L;
        System.out.println(a4);
        System.out.println("------------------");

        // float
        float f = 1000000.30F;
        System.out.println(f);
        System.out.println("------------------");

        // double
        double d = 20.1;
        System.out.println(d);
        System.out.println("------------------");

        // char
        char ch = '女';
        System.out.println(ch);
        System.out.println("------------------");

        // boolean
        boolean b = false;
        System.out.println(b);
    }

}
