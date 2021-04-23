package com.itheima.demo05_operator;

/**
 * 自增自减运算符
 * <p>
 * 自增运算符（++），运算规则如下：
 * 场景1：单独使用
 * 前加后加没有区别，都是自身+1
 * 场景2：参与操作
 * 前加：先自身+1，然后用新值参与运算
 * 后加：先以原值参与运算，然后再自身+1
 */
public class OperatorDemo02 {

    public static void main(String[] args) {
        int a = 10;
        // a++;
        // ++a;

        // 参与运算
        // 后加：先以原值参与运算，然后再自身+1
        int b = a++;
        System.out.println(a); // 11
        System.out.println(b); // 10

        // 前加：先自身+1，然后用新值参与运算
        int c = ++a;
        System.out.println(a); // 12
        System.out.println(c); // 12

        // 扩展：++ 和 -- 都隐含了 强制类型转换
        byte b1 = 3;
        // byte b2 = b1 + 4;  // 报错
        // b1 = (byte)(b1 + 1);
        // 上面的代码可以简写：
        b1++;   // 等价于  b1 = (byte)(b1 + 1);
        System.out.println(b1);

    }
}
