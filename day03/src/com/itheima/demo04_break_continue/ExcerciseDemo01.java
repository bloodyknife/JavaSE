package com.itheima.demo04_break_continue;

/**
 * 案例：演示 break 和 continue
 *
 * victory 2021/4/18 17:04
 */
public class ExcerciseDemo01 {

    public static void main(String[] args) {

        // 已知代码如下：
        // 问：在注释的地方填充什么代码，
        // 分别可以实现循环共计打印：2次，7次，13次 "Hello World!"字符串？
        for (int i = 1; i <=10; i++) {
            if (i % 3 == 0) {
                // 这里加入什么？
                // break;   // 1, 2
                // continue;   // 1, 2, 4, 5, 7, 8, 10

                // 1,2,3,3,4,5,6,6,7,8,9,9,10
                System.out.println("HelloWorld! " + i);
            }
            System.out.println("HelloWorld! " + i);
        }


    }


}
