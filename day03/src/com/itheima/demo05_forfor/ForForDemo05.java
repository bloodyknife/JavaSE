package com.itheima.demo05_forfor;

/**
 * 案例：循环嵌套 打印九九乘法表
 *
 * victory 2021/4/18 17:38
 */
public class ForForDemo05 {

    public static void main(String[] args) {

        // 需求：打印99乘法表
        // 外循环：控制第二个乘数
        for (int i = 1; i <= 9; i++) {
            // 内循环：控制第一个乘数
            for (int j = 1; j <= i; j++) {  // 正三角形判断条件发生变化
                System.out.print(j + " * " + i + " = " + j * i + "\t");
            }
            System.out.println();
        }

    }

}
