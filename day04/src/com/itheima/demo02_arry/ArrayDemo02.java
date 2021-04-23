package com.itheima.demo02_arry;

/**
 * 案例：数组的常见操作：遍历数组
 *
 * 遍历数组：意思是把数组中的每一个元素都打印到控制台上
 *
 * victory 2021/4/21 19:01
 */
public class ArrayDemo02 {

    public static void main(String[] args) {
        //1. 定义int类型的数组arr, 存储元素：11，22，33，44，55
        int[] arr = {11, 22, 33, 44, 55};

        //2. 通过for循环，遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);  // 根据索引找对应的元素
        }


    }

}
