package com.itheima.demo04_exercise;

/**
 * 练习：遍历数组
 *
 * victory 2021/4/22 20:20
 */
public class MethodDemo01 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 44, 55};
        printArray(arr);  // Ctrl+Q 查看方法解释说明
    }

    /**
     * 功能：该方法是用来遍历int类型的数组的
     * @param arr 表示具体要遍历的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
