package com.itheima.demo02_while;

/**
 * While循环 ：珠穆朗玛峰问题
 *
 * 1. 已知世界最高山峰是珠穆朗玛峰（8844.43米 = 8844430毫米）
 * 2. 假设我有一张足够大的纸，它的厚度是0.1毫米
 * 3. 请问，我折叠多少次，可以折成珠穆朗玛峰的高度
 *
 * victory 2021/4/16 17:13
 */
public class WhileDemo03 {

    public static void main(String[] args) {
        // 1. 定义变量，记录纸张的厚度(毫米)
        double paper = 0.1;

        // 2. 定义变量，记录珠峰的高度（毫米）
        int zf = 8844430;

        // 3. 定义变量，记录折叠次数
        int count = 0;

        // 4. 通过while循环，获取折叠次数，只要纸张厚度不大于珠峰高度，就一直折叠
        while (paper < zf) {
            // 5. 每折叠1次，计数器+1, 纸的厚度 *2
            paper *= 2;
            count++;
        }

        // 6. 打印计数器结果
        System.out.println("折叠次数为：" + count);
    }

}
