package com.itheima.demo03_method;

/**
 * 演示方法的使用：无参有返回值 的方法
 * 案例：判断奇偶数
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo04 {

    public static void main(String[] args) {
        boolean flag = isEvenNumber();
        System.out.println(flag);
    }

    public static boolean isEvenNumber() {
        int num = 10;
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
