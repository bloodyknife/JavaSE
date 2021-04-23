package com.itheima.demo04_if;

/**
 * if 语句的结构：单分支
 *
 * 格式：
 * if (关系表达式) {
 *     语句体
 * }
 *
 * 执行流程：
 * 1. 先执行关系表达式，看结果是true, 还是false
 * 2. 如果是 true, 就执行对应的语句体
 * 3. 如果是 false, 不执行语句体
 *
 * victory 2021/4/12 17:47
 */
public class IfDemo01 {

    public static void main(String[] args) {

        // 定义变量 time 表示时间，如果它的范围是在[0, 8]之间，就打印早上好，否则不操作
        System.out.println("start");
        int time = 3;
        // if结构：单分支
        if (time >= 0 && time <= 8) {
            System.out.println("早上好！");
        }
        System.out.println("end");



        int a = 10;
        if (++a > 20) {

        }
        System.out.println(a);


    }

}
