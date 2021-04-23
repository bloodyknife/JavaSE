package com.itheima.demo02_while;

/**
 * While循环入门
 *
 * 适用于循环次数 不固定 的情况
 *
 * 格式：
 * 初始化条件;
 * while(判断条件) {
 * 循环体；
 * 控制条件
 * }
 *
 * victory 2021/4/16 17:13
 */
public class WhileDemo01 {

    public static void main(String[] args) {
        // 打印10次 HelloWorld
        int i = 1;
        while (i <= 10) {
            System.out.println("HelloWorld " + i);
            i++;
        }

        System.out.println("------------------");

        int x = 0;
        while (x < 10) {
            x++;
            System.out.println("HelloWorld " + x);
        }

    }

}
