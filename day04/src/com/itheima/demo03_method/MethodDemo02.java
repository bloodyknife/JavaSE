package com.itheima.demo03_method;

/**
 * 演示方法的使用：有参无返回值 的方法
 *
 * victory 2021/4/22 16:59
 */
public class MethodDemo02 {

    public static void main(String[] args) {
        // 1.定义方法 isEventNumber(), 该方法接收一个int类型的整数num
        // 2.判断num是奇数还是偶数，并打印
        /*
        * 调用方法的三个步骤：
        * 1. 写方法名，用谁就写谁，注意大小写，不要写错了
        * 2. 传参，方法要什么，我们就给什么
        * 3. 接收返回值，即：方法给什么，我们就用什么类型的变量来接收
        * */
        isEventNumber(13);
    }

    /*
    * 定义方法的三个明确
    * 1. 明确方法名
    * 2. 明确参数列表
    * 3. 明确返回值的数据类型
    * */
    // 判断num是奇数还是偶数，并打印
    public static void isEventNumber(int num) { // 形参：形容调用方法的时候需要传入什么类型的数据
        if (num % 2 == 0) {
            System.out.println(num+"是偶数");
        } else {
            System.out.println(num+"是奇数");
        }
    }



}
