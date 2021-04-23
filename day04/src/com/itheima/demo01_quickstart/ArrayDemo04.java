package com.itheima.demo01_quickstart;

/**
 * 案例：演示两个数组的内存图
 *
 * victory 2021/4/20 17:41
 */
public class ArrayDemo04 {

    public static void main(String[] args) {
        //1. 定义一个长度为3的 int类型的数组
        int[] arr = new int[3];
        //2. 修改数组中的第一个元素为：11
        arr[0] = 11;
        //3. 打印数组中第一、第二个元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //4. 打印数组对象
        System.out.println(arr);  // 地址值

        //5. 定义一个 int类型的数组，存储元素 1，2
        int[] arr2 = new int[]{1, 2};
        //6. 修改数组的第二个元素值为：22
        arr2[1] = 22;
        //7. 打印数组的第二个元素
        System.out.println(arr2[1]);
        //8. 打印数组对象
        System.out.println(arr2); // 地址值
    }

}
