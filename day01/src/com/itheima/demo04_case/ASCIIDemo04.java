package com.itheima.demo04_case;

/**
 * ASCII 码表
 * 就是用来描述 字符 及其 对应数字 之间的关系 （a -> 97）
 *  'a' -> 97
 *  'A' -> 65
 *  '0' -> 48
 *
 * victory 2021/4/10 20:33
 */
public class ASCIIDemo04 {

    public static void main(String[] args) {
        System.out.println('a' + 0);
        System.out.println('夯' + 0);

        int a = 22831;
        char ch = (char)a;
        System.out.println(ch);

    }
}
