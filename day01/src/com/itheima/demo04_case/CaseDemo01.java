package com.itheima.demo04_case;

/**
 * 自动类型转换，也叫：隐式类型转换
 * 格式：无特殊格式，直接写即可
 * 规则：类型兼容，范围小 的数据可以自动转换成 范围大 的数据
 *
 * 提升顺序：
 *  byte,short,char -> int -> long ->float ->double
 *  因为int是默认的整型，所以只要是数学运算，你能得到的最小类型就是int
 *  例如：
 *  byte b1 = 3;
 *  byte b2 = 4;
 *  byte b3 = b1 + b2; // 报错
 *  int b4 = b1 + b2; // 正确
 * victory 2021/4/10 19:41
 */
public class CaseDemo01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);
        System.out.println("------------------");

        int aa = 11;
        byte bb = 22;
        int cc = aa + bb;
        // byte cc = aa + bb; // 报错
        System.out.println(cc);
        System.out.println("------------------");

        System.out.println('a' + 1);
        char a2 = 'a' + 1;
        System.out.println(a2);
        System.out.println("------------------");

        // System.out.println(false + 1);  // 类型不兼容，报错


    }


}
