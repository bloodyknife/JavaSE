package com.itheima.demo05_switch;

import java.util.Scanner;

/**
 * switch版本 案例：发放奖励
 *
 * 需求：小明考试得分
 *  90-100 山地自行车一辆
 *  80-89 游乐场玩一次
 *  70-79 变形金刚玩具一个
 *  70 以下 胖揍一顿
 *
 * victory 2021/4/12 17:47
 */
public class SwitchDemo03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入小明的考试成绩：：");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            // 成绩合法
            switch (score / 10) {  // 结果：0,1,2,3,4,5,6,7,8,9,10
                case 10:
                case 9:
                    System.out.println("山地自行车一辆");
                    break;
                case 8:
                    System.out.println("游乐场玩一次");
                    break;
                case 7:
                    System.out.println("变形金刚玩具一个");
                    break;
                default:
                    System.out.println("胖揍一顿");
            }

        } else {
            // 成绩不合法
            System.out.println("没有这样的成绩，你是从火星来的吧！");
        }

    }

}
