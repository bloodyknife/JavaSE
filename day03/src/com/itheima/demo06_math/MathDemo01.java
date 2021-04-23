package com.itheima.demo06_math;

/**
 * 演示 Math 入门，用来获取随机数
 *
 * 1. Math 是在 java.lang 包下的类，可以直接拿来用，不需要导包
 * 2. 通过 Math.random() 方式，可以获取一个 0.0 到 1.0 之前的随机数，前闭后开，也叫：包左不包右
 * 3. 案例：获取一个 1-100之间的数字
 *   Math.random() * 100     ->   [0.0, 100) ->  0.0  99.999...
 *   int num = (int)(Math.random() * 100 + 1) 包含1，也包含100
 *
 * victory 2021/4/19 17:17
 */
public class MathDemo01 {

    public static void main(String[] args) {
        // 通过 Math.random() 方式，可以获取一个 0.0 到 1.0 之前的随机数，前闭后开，也叫：包左不包右
        // double random = Math.random();

        // 获取一个 1 到 100 之间的随机数，包含1，也包含 100
        /*int num = (int)(Math.random() * 100 + 1);
        System.out.println(num);*/

        // 需求：使用 Math 类，生成 5 个 1~10之间的随机整数，并打印
        for (int i = 0; i < 5; i++) {
            int num =  (int)(Math.random() * 10 + 1);
            System.out.println(num);
        }
    }

}
