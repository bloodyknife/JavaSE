package com.itheima.demo01_operator;

/**
 * 三元运算符
 * <p>
 * 格式：
 * 关系表达式 ? 表达式1 : 表达式2
 * <p>
 * 执行流程：
 * 1. 先判断关系表达式，看其结果是true还是false
 * 2. true, 执行表达式1
 * 3. false, 执行表达式2
 * <p>
 * victory 2021/4/11 12:07
 */
public class OperatorDemo04 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = a > b ? a : b;
        System.out.println("max=" + max);

    }

}
