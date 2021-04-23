package com.itheima.demo05_forfor;

/**
 * 案例：循环嵌套 打印星星序列
 *
 * victory 2021/4/18 17:38
 */
public class ForForDemo02 {

    public static void main(String[] args) {
        // 需求：打印一个3行5列的矩形星星序列
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
