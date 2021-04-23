package com.itheima.demo01_for;

/**
 * 案例：for循环打印数字
 *
 * victory 2021/4/15 16:42
 */
public class ForDemo02 {

    public static void main(String[] args) {

        // 通过for循环，打印1~5之间的数字
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 通过for循环，打印5~1之间的数字
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
