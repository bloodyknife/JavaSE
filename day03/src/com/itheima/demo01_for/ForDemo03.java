package com.itheima.demo01_for;

/**
 * 案例：for循环 求和思想
 *
 * victory 2021/4/15 16:42
 */
public class ForDemo03 {

    public static void main(String[] args) {

        // 定义一个sum变量，记录所有的数字和，变量要定义到循环的 外边
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

}
