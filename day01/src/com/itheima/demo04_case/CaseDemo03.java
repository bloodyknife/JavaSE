package com.itheima.demo04_case;

/**
 * 变量和常量的运算规则
 *
 * victory 2021/4/10 20:17
 */
public class CaseDemo03 {

    public static void main(String[] args) {
        /*
        * Java 中针对于常量，有常量优化机制
        *   针对于byte类型：
        *       常量相加：会直接运算，然后看结果在不在左边的数据类型范围内，在，不报错，不在报错
        *       变量相加：会自动提升数据类型，然后再运算
        *           byte,short,char -> int -> long -> float ->double
        *   针对于String类型：
        *       后面API解释
        * */

        byte b1 = 3;
        byte b2 = 4;
        byte b3 = 3 + 4;  // 不报错，常量优化机制 （运算结果在 byte范围内）
        // byte b4 = 127 + 4; // 报错，运算结果 不在byte范围内 -128~127
        // byte b4 = b1 + b2; // 报错，变量相加会自动提升类型，同理：变量和常量运算，按变量走

    }

}
