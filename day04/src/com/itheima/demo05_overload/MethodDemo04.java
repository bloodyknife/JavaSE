package com.itheima.demo05_overload;

/**
 * 方法的参数传递问题之：形参是引用类型
 *
 * 记忆：
 * 引用类型作为参数时，形参的改变直接影响实参（String类型除外，String类型当作形参使用时，用法和基本类型一致）
 *
 * victory 2021/4/23 10:46
 */
public class MethodDemo04 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};  //0x001
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int[] arr) {  // 形参
        arr[1] = 200;
    }

}
