package com.itheima.demo02_sacnner;

import java.util.Scanner;

/**
 *
 * 案例：获取三位数的各个位数上的数字，并打印结果
 *
 * victory 2021/4/12 16:35
 */
public class ScannerDemo03 {

    public static void main(String[] args) {

    /*
        需求：
            提示用户键盘录入一个三位数，并接收
            求这个数的个位，十位，百位分别是多少
            规律：
            例如：153
            个位： 153 / 1   % 10    = 3
            十位： 153 / 10  % 10    = 5
            百位： 153 / 100 % 10    = 1
            并将结果打印到控制台上
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");

        int num = sc.nextInt();

        int ge = num / 1 % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;

        System.out.println("您录入的数字是：" + num + ",该数字的个位数是："
                + ge+ ",该数字的十位数是：" + shi + ",该数字的百位数是：" + bai);


    }

}
