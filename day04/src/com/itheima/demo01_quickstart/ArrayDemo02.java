package com.itheima.demo01_quickstart;

/**
 * 案例：演示数组的基本操作
 *
 * 数组名[索引]  根据索引值，获取其对应的元素
 * 数组名[索引] = 值 修改指定索引处的元素为指定的值
 * 数组名.length  获取数组的长度
 * 数组名.length - 1 获取数组中的最大索引
 *
 * 数组的特点：
 * 1. 数组中的每个元素都是有编号的（也叫下标，角标，索引），且索引从0开始
 * 2. 数组中的元素都是有默认值的
 * 例如：
 * int[]  --> 0
 * double[]  --> 0.0
 * boolean[]  --> false
 * String[] --> null
 *
 * victory 2021/4/20 17:41
 */
public class ArrayDemo02 {

    public static void main(String[] args) {
        // 1. 定义一个长度为 5 的 int 类型的数组
        int[] arr = new int[5];
        // 打印数组，我们获取的是地址值
        System.out.println(arr);

        // 2. 打印数组中的第3个元素
        System.out.println(arr[2]);

        // 3. 设置数组中的第一个元素值为 11
        arr[0] = 11;

        // 4. 获取数组中的第一个元素值，并将其赋值给变量 a,然后打印
        int a = arr[0];
        System.out.println("a: " + a);

        // 5. 打印数组的长度
        System.out.println("数组的长度：" + arr.length);

        // 6. 打印数组元素的最大索引
        System.out.println("数组元素的最大索引：" + (arr.length - 1));

    }

}
