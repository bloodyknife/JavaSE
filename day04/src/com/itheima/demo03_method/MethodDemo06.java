package com.itheima.demo03_method;

/**
 * 演示方法的使用：有参有返回值 的方法
 *
 * 案例：判断奇偶数
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo06 {

    public static void main(String[] args) {
        boolean flag = isEvenNumber(35);
        System.out.println(flag);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }


}
