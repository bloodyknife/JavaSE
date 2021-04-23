package com.itheima.demo04_if;

import java.util.Scanner;

/**
 * 案例：if else ， 实现获取三个整数的最大值
 * victory 2021/4/12 17:47
 */
public class IfDemo06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数字：");
        int a1 = sc.nextInt();
        System.out.println("请录入第二个数字：");
        int a2 = sc.nextInt();
        System.out.println("请录入第三个数字：");
        int a3 = sc.nextInt();

        // 方式一：if.else嵌套
        int max1 = a1;  // 假设a1是最大值
        if (a1 > a2) {
            if (a1 > a3) {
                max1 = a1;
            } else {
                max1 = a3;
            }
        } else {
            if (a2 > a3) {
                max1 = a2;
            } else {
                max1 = a3;
            }
        }
        System.out.println("max1:" + max1);

        // 方式二：简单暴力版
        int max2 = a1;
        if (a1 > a2 && a1 > a3) {
            max2 = a1;
        } else if (a2 > a1 && a2 > a3) {
            max2 = a2;
        } else {
            max2 = a3;
        }
        System.out.println("max2:" + max2);

        // 方式三：三元运算符嵌套版


    }

}
