package com.itheima.demo04_if;

import java.util.Scanner;

/**
 * 案例：演示使用if语句的小技巧
 *
 * 如果if控制的语句体只有一行代码，则大括号可以省略
 * 前提：这一行代码不能是定义变量，因为定义变量不是一行代码
 *
 * victory 2021/4/12 17:47
 */
public class IfDemo07 {

    public static void main(String[] args) {
        if (5 > 30)
            System.out.println("Hello World");
        System.out.println("天马流星拳");

        // if (5 > 3)
            // int a = 10; // 报错

        // 相当于
            /*if (5 > 3){
                int a;
            }
            a = 10;*/

    }

}
