package com.itheima.demo01_quickstart;

/**
 * 案例：演示数组的定义
 *
 * 数组的概述：用来存储 多个 同类型元素 的元素
 *
 * 定义格式：
 * 动态初始化：我们给定长度，由系统给出默认值
 * 格式1：
 *   数组类型[] 数组名 = new 数据类型[长度]
 *   int[] arr = new int[5];
 * 格式2:
 *   数组类型 数组名[] = new 数据类型[长度]
 *   int arr[] = new int[5];
 *
 * 静态初始化：我们给定初始化值，由系统决定长度
 * 格式1：
 *   数组类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3, ...}
 *   int[] arr = new int[]{11, 22, 33};
 * 格式2：
 * 数组类型[] 数组名 = {元素1, 元素2, 元素3, ...}
 * int[] arr = {11, 22, 33};  // 语法糖：用来简化某些语法的格式
 *
 *
 * victory 2021/4/20 17:41
 */
public class ArrayDemo01 {

    public static void main(String[] args) {
        // 1. 创建int类型的数组，用来存储3个元素
        int[] arr1 = new int[3];
        // int arr2[] = new int[3];

        // 2. 创建int类型的数组，存储数据11，22，33
        int[] arr3 = new int[]{11, 22, 33};
        int[] arr4 = {11, 22, 33};

        // 下述写法，所谓的动静结合，不允许，是错误写法
        // int[] arr5 = new int[3]{11, 22, 33};
    }

}
