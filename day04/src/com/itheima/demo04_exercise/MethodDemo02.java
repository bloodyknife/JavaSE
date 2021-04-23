package com.itheima.demo04_exercise;

/**
 * 练习：获取数组中的最值
 *
 * victory 2021/4/22 20:20
 */
public class MethodDemo02 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int max = getMax(arr);
        System.out.println(max);
    }

    /**
     * 功能：获取int数组的元素中的最大值
     * @param arr 要用来获取最大值的数组
     * @return 数组中元素的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }



}
