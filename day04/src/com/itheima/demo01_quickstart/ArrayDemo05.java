package com.itheima.demo01_quickstart;

/**
 * 案例：两个数组指向同一个地址
 *
 * victory 2021/4/20 17:41
 */
public class ArrayDemo05 {

    public static void main(String[] args) {
        //1. 定义一个int类型的数组，存储元素11, 22, 33
        int[] arr = {11, 22, 33};
        //2. 打印数组对象
        System.out.println(arr);  // 地址值
        //3. 打印数组中的各个元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //4. 定义第二个数组，把第一个数组的地址值赋值给第二个数组
        int[] arr2 = arr;
        //5. 通过第二个数组，修改第二个元素值为200
        arr2[1] = 200;
        //6. 打印数组对象
        System.out.println(arr2);
        //7. 打印数组中的各个元素值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

}
