package com.itheima.demo01_for;

/**
 * 案例：获取水仙花数
 *
 * 水仙花数：
 * 1. 是一个三位数
 * 2. 它的各个位数的立方和等于它本身
 * 3. 例如：153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
 *
 * victory 2021/4/15 16:42
 */
public class ForDemo05 {

    public static void main(String[] args) {

        //1. 获取所有的三位数
        for (int i = 100; i < 1000; i++) {
            //2. 获取该数字的各个位数值
            int ge  = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //3. 判断是否是水仙花数，如果是，则打印
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
            }
        }

    }

}
