package com.itheima.demo02_arry;

/**
 * 案例：演示使用数组的两个小问题
 * 1. 索引越界异常: 访问了不存在的索引
 * 2. 空指针异常：访问的对象为空，即没有这个对象，你还使用它的功能，肯定报错
 *
 * victory 2021/4/21 19:01
 */
public class ArrayDemo01 {

    public static void main(String[] args) {
        //1. 定义int类型的数组，存储元素11，22
        int[] arr = {11, 22};
        //2. 打印数组第2个元素
        System.out.println(arr[1]); // 22
        //3. 尝试打印数组中的第3个元素
        // System.out.println(arr[2]); // 数组索引越界异常 ArrayIndexOutOfBoundsException
        System.out.println("------------------");

        // 4. 将 null(空常量) 赋值给数组
        arr = null;
        // 5. 尝试打印数组的第一个元素
        // System.out.println(arr[0]);  // 空指针异常 NullPointerException

    }

}
