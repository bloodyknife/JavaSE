package com.itheima.demo03_do_while;

/**
 * Do.While循环
 *
 * 格式：
 * 初始化条件
 * do {
 *     循环体
 *     控制条件
 * } while(判断条件);
 *
 * 特点：
 * 先执行一次，然后再判断
 *
 * victory 2021/4/18 12:55
 */
public class DoWhileDemo01 {

    public static void main(String[] args) {
        // 通过 do.while循环，在控制台打印10次Hello World
        int i = 1;
        do {
            System.out.println("Hello World" + i);
            i++;
        } while (i <= 10);
    }

}
