package com.itheima.demo05_forfor;

/**
 * 案例：循环嵌套入门
 * 格式：
 * for(初始化; 判断条件; 控制条件){  // 外循环
 *     for(初始化; 判断条件; 控制条件) {  // 内循环
 *
 *     }
 * }
 * 执行特点：
 * 外循环一次，内循环一轮（一圈）
 * <p>
 * victory 2021/4/18 17:38
 */
public class ForForDemo01 {

    public static void main(String[] args) {
        // 需求：打印2020年1月至2023年12月之间所有的月份，格式为：XXXX年XX月
        // 方式一：复杂写法
        // 打印 2020年所有的月份
        for (int i = 1; i <= 12; i++) {
            System.out.print("2020年" + i + "月\t");
        }
        System.out.println(); // 换行
        // 打印 2021年所有的月份
        for (int i = 1; i <= 12; i++) {
            System.out.print("2021年" + i + "月\t");
        }
        System.out.println();
        // 打印 2022年所有的月份
        for (int i = 1; i <= 12; i++) {
            System.out.print("2022年" + i + "月\t");
        }
        System.out.println();
        // 打印 2023年所有的月份
        for (int i = 1; i <= 12; i++) {
            System.out.print("2023年" + i + "月\t");
        }
        System.out.println();
        System.out.println("------------ 我是华丽的分割线 ------------");

        // 方式二：简化版，采用循环嵌套
        // 1. 定义外循环，控制年份
        for (int i = 2020; i <= 2023 ; i++) {
            // i的取值：2020,2021,2022,2023
            // 2. 定义内循环，控制每年的月份
            for (int j = 1; j <= 12 ; j++) {
                System.out.print(i + "年" + j + "月\t");
            }
            System.out.println();
        }

    }

}
