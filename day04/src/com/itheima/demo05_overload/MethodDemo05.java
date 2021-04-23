package com.itheima.demo05_overload;

/**
 * 打印数组，（伪）标准版
 *
 * victory 2021/4/23 10:46
 */
public class MethodDemo05 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray2(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            // arr[i] 就是数组中的每一个元素

            // 判断当前是否是数组的最后一个元素，如果是，就拼接 ] + 换行
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    // 第二种写法：
    public static void printArray2(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "]\r\n" : ", "));
        }
    }

}
