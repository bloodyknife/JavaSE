package com.itheima.demo06_debug;

/**
 * 案例：演示Debug断点调试
 *
 * 步骤:
 * 1.加断点，哪里不会点哪里
 * 2.
 *
 *
 * victory 2021/4/23 15:37
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a, b);
        System.out.println("sum: " + sum);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
