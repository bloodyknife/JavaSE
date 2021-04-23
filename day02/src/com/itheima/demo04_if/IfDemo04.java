package com.itheima.demo04_if;

import java.util.Scanner;

/**
 * if多分支 案例：打印星期
 *
 * victory 2021/4/12 17:47
 */
public class IfDemo04 {

    public static void main(String[] args) {

        // 接收用户录入的数字[1, 7],然后打印对应的星期

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入【1-7】的数字：");
        int week = sc.nextInt();

        if (week == 1) {
            System.out.println("星期一");
        } else if (week == 2) {  // else的隐含条件：week != 1 && week = 2
            System.out.println("星期二");
        } else if (week == 3) {  // else的隐含条件：week != 1 && week != 2 && week = 3
            System.out.println("星期三");
        } else if (week == 4) {
            System.out.println("星期四");
        } else if (week == 5) {
            System.out.println("星期五");
        } else if (week == 6) {
            System.out.println("星期六");
        } else if (week == 7) {
            System.out.println("星期日");
        } else {
            System.out.println("你是从火星来的，地球没有这样的星期");
        }


    }

}
