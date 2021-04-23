package com.itheima.demo01_for;

/**
 * 演示 for 循环 入门
 *
 * 适用于循环次数固定的情况
 *
 * 格式：
 * for(初始化条件1; 判断条件2; 控制条件3) {
 *     循环体4
 * }
 *
 * 执行顺序：
 * 第一次循环：1,2,4,3
 * 重复循环：2,4,3
 * 最后一次循环：2 // 判断条件为 false, 则循环结束
 *
 * victory 2021/4/15 16:42
 */
public class ForDemo01 {

    public static void main(String[] args) {

        // 通过for循环，打印10次“Hello World!”
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello World!" + i);
        }

    }

}
