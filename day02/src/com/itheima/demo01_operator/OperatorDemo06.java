package com.itheima.demo01_operator;

/**
 * 案例：演示三元运算符的嵌套
 * <p>
 * victory 2021/4/11 12:07
 */
public class OperatorDemo06 {

    public static void main(String[] args) {
        // 1. 一座寺庙里住着三个和尚，已知他们的身高分别为150cm\210cm\165cm
        // 2. 请用程序实现获取这三个和尚的最高身高

        // 定义三个变量，分别记录三个和尚的身高
        int h1 = 150;
        int h2 = 210;
        int h3 = 165;

        // 通过三元运算符获取前两个和尚的最高身高
        int temp = h1 > h2 ? h1 : h2;

        // 再通过三元运算符，获取第二步的身高 和 第三个和尚之间的最高身高
        int max = temp > h3 ? temp : h3;

        System.out.println("三个和尚的最高身高是：" + max + "cm");

        // 方式二：通过三元运算符嵌套实现
        int max2 = (h1 > h2) ? (h1 > h3 ? h1 : h3) : (h2 > h3 ? h2 : h3);
        System.out.println("max2:" + max2);


    }

}
