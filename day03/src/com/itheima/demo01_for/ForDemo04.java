package com.itheima.demo01_for;

/**
 * 案例：求偶数和
 *
 * victory 2021/4/15 16:42
 */
public class ForDemo04 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                // 说明是偶数
                sum += i;
            }
        }

        System.out.println("sum:" + sum);

        System.out.println("---------------------");

        // 简化版
        int sum2 = 0;

        for (int i = 2; i <=100; i+=2) {
            // 走到这里一定是偶数
            sum2 += i;
        }

        System.out.println("sum2:"+ sum2);
    }

}
