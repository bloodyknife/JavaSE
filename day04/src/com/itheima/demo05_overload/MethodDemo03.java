package com.itheima.demo05_overload;

/**
 * 方法的参数传递问题之：形参是基本类型
 *
 * 记忆：
 * 基本类型作为参数时，参数的改变对实参没有任何影响
 *
 * victory 2021/4/23 10:46
 */
public class MethodDemo03 {

    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);
    }

    public static void change(int number) {  // 形参
        number = 200;
    }

}
