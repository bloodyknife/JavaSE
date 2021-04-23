package com.itheima.demo06_debug;

/**
 * 案例：演示Debug断点调试
 *
 * 步骤:
 * 1.加断点，哪里不会点哪里
 * 2.运行了加了断点的程序，注意：不要选择run, 要选择debug
 * 3.开始调试后，看哪里呢？
 *  Debugger: 看代码执行到哪里了
 *  Console: 控制台，就是查看程序运行结果的
 *  Variable: 就是查看 变量的变化过程的
 * 4. 如何进行下一步？
 *   F7：逐过程调试
 *   F8：逐行调试
 *   F9：逐断点调试
 * 5. 如何删除断点？
 *   方式1：一个一个删除
 *   方式2：批量删除，选择breakpoints(双红点)，移除断点即可
 *
 * victory 2021/4/23 15:37
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = getSum(a, b);
        System.out.println("sum: " + sum);
    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
