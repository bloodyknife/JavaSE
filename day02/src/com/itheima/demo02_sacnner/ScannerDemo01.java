package com.itheima.demo02_sacnner;

import java.util.Scanner;

/**
 * 键盘录入入门知识
 *
 * 用来接收用户录入的数据（整数）
 *
 * victory 2021/4/12 16:35
 */
public class ScannerDemo01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入您的年龄：");
        int age = sc.nextInt();

        System.out.println("您的年龄是：" + age);
    }

}
