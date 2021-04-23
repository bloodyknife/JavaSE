package com.itheima.demo02_arry;

/**
 * 案例：数组的常见操作：反转数组
 *
 * victory 2021/4/21 19:01
 */
public class ArrayDemo04 {

    public static void main(String[] args) {

        //1. 定义int类型的数组arr
        int[] arr = {11, 33, 55, 22, 44};

        //2. 反转数组，并打印反转后的结果
        /*
         * 核心：
         * 1. 谁和谁交换
         * 2. 交换次数是多少？
         *
         * 第一次反转：arr[0] 和 arr[arr.length -1 -0]
         * 第二次反转：arr[1] 和 arr[arr.length -1 -1]
         * ...
         *
         * 结论：
         * 1. arr[i] 和 arr[arr.length -1 - i]  交换
         * 2. 交换次数：arr.length / 2
         *
         * */
        for (int i = 0; i < arr.length / 2; i++) {
            // arr[i] 和 arr[arr.length -1 - i]交换
            int temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}
