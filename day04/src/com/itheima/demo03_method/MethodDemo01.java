package com.itheima.demo03_method;

/**
 * 演示方法的使用：无参无返回值 的方法
 *
 * 方法的定义格式：
 * 修饰符 返回值的数据类型 方法名(数据类型 参数1，数据类型 参数2，...) {
 *     方法体
 *     return 具体的返回值
 * }
 *
 * 注意：
 * 1. 方法与方法是平级关系，不能嵌套使用
 * 2. 方法的功能，越单一越好
 * 3. 方法只有被调用才会执行
 * 4. 定义方法的时候，写在参数列表中的参数叫：形参
 *    调用方法的时候，写在参数列表中的参数叫：实参
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo01 {

    public static void main(String[] args) {
        printHello();
    }

    // 定义 printHello() 方法，用来打印 “Hello World!” 字符串
    public static void printHello() {
        System.out.println("Hello World!");
    }

}
