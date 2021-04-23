package com.itheima.demo02_while;

/**
 * While循环 ：求和思想
 *
 * victory 2021/4/16 17:13
 */
public class WhileDemo02 {

    public static void main(String[] args) {
        // 获取1-100之间所有偶数和，并打印
        int sum = 0;

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++; // 千万别忘记 i++
        }
        System.out.println("sum:" + sum);
        System.out.println("---------------------");


        int sum2 = 0;

        int x = 2;
        while (x <= 100) {
            sum2 += x;
            x+=2;
        }
        System.out.println("sum2:" + sum2);



    }

}
