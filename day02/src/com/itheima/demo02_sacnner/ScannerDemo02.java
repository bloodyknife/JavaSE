package com.itheima.demo02_sacnner;

import java.util.Scanner;

/**
 *
 * 键盘录入版：和尚的身高
 *
 * victory 2021/4/12 16:35
 */
public class ScannerDemo02 {


    public static void main(String[] args) {

        // 创建 Scanner 类型的对象
        Scanner sc = new Scanner(System.in);

        // 提示录入三个和尚的身高并接收
        System.out.println("请录入第一个和尚的身高：");
        int h1 = sc.nextInt();
        System.out.println("请录入第二个和尚的身高：");
        int h2 = sc.nextInt();
        System.out.println("请录入第三个和尚的身高：");
        int h3 = sc.nextInt();

        // 通过三元获取三个和尚的最高身高
        int max = (h1 > h2) ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 : h3);

        // 打印结果
        System.out.println("三个和尚身高最高的是：" + max);

    }

}
