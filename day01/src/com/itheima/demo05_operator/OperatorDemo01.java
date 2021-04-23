package com.itheima.demo05_operator;

/**
 * 算术运算符
 * <p>
 * 分类：+，-，*，/，%，++，--
 * 注意事项：
 * 1.java中整数相除结果还是整数，要想获取小数，必须有浮点型参与
 * 2.关于+号
 * 如果是数字相加：就是加法运算
 * 如果是字符串相加：就是拼接字符串，会得到一个新的字符串
 * <p>
 * victory 2021/4/11 10:49
 */
public class OperatorDemo01 {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(10 + 3);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 整数相除结果还是整数，要想获取小数，必须有浮点型参与
        System.out.println(a / b * 1.0);
        System.out.println(10 / 3.0);

        // 如果是字符串相加：就是拼接字符串，会得到一个新的字符串
        System.out.println("hello" + 5 + 5); // hello55
        System.out.println("hello" + (5 + 5)); // hello10
        System.out.println(5 + 5 + "hello" + 5 + 5); // 10hello55




    }
}
