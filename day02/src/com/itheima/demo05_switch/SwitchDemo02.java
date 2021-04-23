package com.itheima.demo05_switch;

import java.util.Scanner;

/**
 * 案例：演示switch语法，case穿透
 *
 * case穿透：
 * 不写 break ,就会出现穿透
 *
 *
 * victory 2021/4/14 18:34
 */
public class SwitchDemo02 {

    public static void main(String[] args) {

        /*
        * 规则：
        * 输入：1，2，12 输出：冬季
        * 输入：3，4，5 输出：春季
        * 输入：6.7，8 输出：夏季
        * 输入：9，10，11 输出：秋季
        * 输入：其它数字，输出：数字有误
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();

        switch (month) {  // 表达式可以放：byte,short,char,int,JDK1.5：枚举, JDK1.7: String
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("没有这样的月份");
                break;
        }


    }

}
