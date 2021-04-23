package com.itheima.demo05_forfor;

/**
 * 案例：循环嵌套 打印5行5列的倒三角
 *
 * 记忆：打印倒三角型和打印矩形相比，初始化条件发生变化
 *
 * victory 2021/4/18 17:38
 */
public class ForForDemo04 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
