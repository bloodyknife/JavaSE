package com.itheima.demo03_method;

/**
 * 演示方法的使用：无参有返回值 的方法
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo03 {

    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("求和结果是：" + sum);
    }

    // 1.定义方法getSum(), 该方法内部有两个int类型的整数
    public static int getSum() {

        int a = 10;
        int b = 20;

        // 分解版
        /*
        int sum = a + b;
        return sum;*/

        // 合并版
        return a + b;
    }


}
