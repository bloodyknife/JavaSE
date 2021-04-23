package com.itheima.demo01_operator;

/**
 * 通过三元运算符，判断老虎得体重是否相同
 *
 * victory 2021/4/11 12:07
 */
public class OperatorDemo05 {

    public static void main(String[] args) {
        // 需求：已知两只老虎得体重分别为 180kg、200kg, 请用程序实现判断两只老虎得体重是否相同

        // 定义两个 int 类型的变量，分别表示两只老虎的体重
        int weight1 = 180;
        int weight2 = 200;

        // 通过三元运算符判断两只老虎的体重是否相同
        boolean flag = weight1 == weight2 ? true : false;

        System.out.println(flag);

        // 方式二：直接通过关系运算符实现
        boolean flag2 = weight1 == weight2;
        System.out.println("flag2=" + flag2);

    }

}
