package com.itheima.demo01_for;

/**
 * 案例：循环的计数思想
 *
 * victory 2021/4/15 16:42
 */
public class ForDemo06 {

    public static void main(String[] args) {

        // 统计所有水仙花数的个数，并将其打印到控制台上
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            int ge = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 100;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                // 是水仙花数，统计变量+1
                count++;
            }
        }

        System.out.println("水仙花数一共有："+ count + "个");


    }

}
