package com.itheima.demo04_break_continue;

/**
 * Break 的用法
 *
 * 作用：用来终止循环，循环不再继续执行
 *
 * victory 2021/4/18 17:04
 */
public class BreakDemo01 {

    // 需求：打印10次HelloWorld, 打印第五次的时候，结束循环
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            // 判断当前是否是第5次循环，如果是，结束循环
            if (i == 5) {
                // 结束循环
                break;
            }
            System.out.println("HelloWorld! " + i);
        }
    }


}
