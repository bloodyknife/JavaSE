package com.itheima.demo02_arry;

/**
 * 案例：数组的常见操作：求数组的最大值
 *
 * victory 2021/4/21 19:01
 */
public class ArrayDemo03 {

    public static void main(String[] args) {
        // 需求：已知各位美女的颜值如下，请求出颜值最高的数字，并打印到控制台上
        // 即：求数组：int[] arr = {5, 15, 2000, 10000, 100, 400}; 的最大值

        //1. 定义int类型的数组arr
        int[] arr = {5, 15, 2000, 10000, 100, 400};

        //2. 定义变量 max , 表示数组元素最大值
        // 假设：数组的第一个元素为最大值
        int max = arr[0];

        //3. 遍历数组，获取到每一个元素，索引从1开始
        for (int i = 1; i < arr.length; i++) {
            //4. 依次比较 max 和当前遍历到的元素 arr[i], 只要比 max 大，就把它赋值给 max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //4. 打印 max
        System.out.println("最大值为：" + max);

    }

}
