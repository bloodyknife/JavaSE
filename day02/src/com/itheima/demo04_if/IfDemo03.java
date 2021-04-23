package com.itheima.demo04_if;

import java.util.Scanner;

/**
 * if双分支 案例：判断奇偶数
 *
 * victory 2021/4/12 17:47
 */
public class IfDemo03 {

    public static void main(String[] args) {

        /*
        * 需求：
        * 1. 提示用户键盘录入一个数据并接收
        * 2. 判断该数据是奇数还是偶数，并打印
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字：");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }

        System.out.println("------------------");

        // 方式2：三元运算符
        System.out.println(num + (num % 2 == 0? "是偶数": "是奇数"));

    }

}
