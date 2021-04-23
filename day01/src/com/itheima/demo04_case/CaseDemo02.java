package com.itheima.demo04_case;

/**
 * 强制类型转换
 *
 * 规则：取值范围大的数据，赋值给 取值范围小的数据，需要通过特定的格式实现
 * 格式：数据类型 变量名 = (目标类型数据) 初始化值
 * 前提：数据类型兼容
 *
 * victory 2021/4/10 20:02
 */
public class CaseDemo02 {

    public static void main(String[] args) {
        double d = 10;
        int a = (int) d;
        System.out.println(a);
        System.out.println("----------------");

        // int aa = (int)"张三";  //类型不兼容，报错

        short s = 3;
        s = (short)(s + 1);
        System.out.println(s);
    }

}
