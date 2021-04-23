package com.itheima.demo04_exercise;

/**
 * 练习：模拟计算器
 *
 * victory 2021/4/22 20:20
 */
public class MethodDemo03 {

    public static void main(String[] args) {
        int[] arr = calculate(10, 3);
        System.out.println("加：" + arr[0]);
        System.out.println("减：" + arr[1]);
        System.out.println("乘：" + arr[2]);
        System.out.println("除：" + arr[3]);
    }

    /**
     * 功能：模拟计算器，用来获取两个整数的加减乘除的结果的
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 一个整数
     */
    public static int[] calculate(int a, int b) {
        // 分别获取这两个整数的加减乘除的运算结果，并返回
        int[] arr = new int[4];
        arr[0] = a + b;
        arr[1] = a - b;
        arr[2] = a * b;
        arr[3] = a / b;
        return arr;
    }

}
