package com.itheima.demo04_if;

import java.util.Scanner;

/**
 * if多分支 案例：发放奖励
 *
 * 需求：小明考试得分
 *  95-100 山地自行车一辆
 *  90-94 游乐场玩一次
 *  80-89 变形金刚玩具一个
 *  80以下 胖揍一顿
 *
 * victory 2021/4/12 17:47
 */
public class IfDemo05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入小明的考试成绩：：");
        int score = sc.nextInt();

        if (score >= 95 && score <= 100) {
            System.out.println("山地自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚玩具一个");
        } else if (score >= 0 && score <= 79) {
            System.out.println("胖揍一顿");
        } else {
            System.out.println("录入的成绩有误");
        }

        System.out.println("-------------------------");

        // 优化版
        if (score > 100 || score < 0) {
            System.out.println("录入的成绩有误！");
        } else  if (score >= 95) {  //　else的隐含条件 score >=0 && score<=100
            System.out.println("山地自行车一辆");
        } else if (score >= 90) { // else的隐含条件 score >=0 && score < 95
            System.out.println("游乐场玩一次");
        } else if (score >= 80) {
            System.out.println("变形金刚玩具一个");
        } else {
            System.out.println("胖揍一顿");
        }

    }

}
