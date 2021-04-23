package com.itheima.demo04_if;

/**
 * if 语句的结构：双分支
 *
 * 格式：
 * if (关系表达式) {
 *     语句体1
 * } else {
 *     语句体2
 * }
 *
 * 执行流程：
 * 1. 先执行关系表达式，看结果是true, 还是false
 * 2. 如果是 true, 就执行语句体1
 * 3. 如果是 false, 就执行语句体2
 *
 * victory 2021/4/12 17:47
 */
public class IfDemo02 {

    public static void main(String[] args) {

        // 定义变量 time 表示时间，如果它的范围是在[0, 8]之间，就打印早上好，否则就打印中午好
        System.out.println("start");
        int time = 9;
        // if结构：单分支
        if (time >= 0 && time <= 8) {
            System.out.println("早上好！");
        } else {
            System.out.println("中午好！");
        }

        // 方式二：通过三元运算符实现
        System.out.println(time >= 0 && time <=8 ? "早上好！":"中午好！");

        System.out.println("end");
    }

}
