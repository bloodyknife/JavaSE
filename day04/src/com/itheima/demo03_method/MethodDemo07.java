package com.itheima.demo03_method;

/**
 * 演示方法的使用：有参有返回值 的方法
 *
 * 案例：求最大值
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo07 {

    public static void main(String[] args) {
        int max = getMax(77, 90);
        System.out.println("最大值：" + max);
    }

    public static int getMax(int a, int b) {
        // return的主要作用是用来结束方法的，捎带可以返回值
        return a > b ? a : b;
    }



}
