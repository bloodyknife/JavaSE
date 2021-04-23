package com.itheima.demo05_forfor;

/**
 * 案例：循环嵌套 打印5行5列的正三角形
 *
 * victory 2021/4/18 17:38
 */
public class ForForDemo03 {

    public static void main(String[] args) {

        // 打印正三角型和打印矩形相比，判断条件发生变化
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
