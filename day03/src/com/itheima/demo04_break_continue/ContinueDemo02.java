package com.itheima.demo04_break_continue;

/**
 * Continue 的用法
 *
 * 作用：跳过本次循环，直接开始下一次循环
 *
 * victory 2021/4/18 17:04
 */
public class ContinueDemo02 {

    // 需求：打印1~10之间，所有不是3倍的整数
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            // 判断如果当前数字是3的倍数，就结束本次循环，即：3的倍数不输出
            if (i % 3 == 0) {
                // 结束本次循环
                continue;
            }
            System.out.println("i:" + i);
        }
    }


}
