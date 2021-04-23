package com.itheima.demo03_method;

/**
 * 演示方法的使用：有参有返回值 的方法
 *
 *  修饰符 返回值的数据类型 方法名(数据类型 参数1，数据类型 参数2，...) {
 *      方法体
 *      return 具体的返回值
 *  }
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo05 {

    public static void main(String[] args) {
        int sum = getSum(34, 33);
        System.out.println(sum);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

}
