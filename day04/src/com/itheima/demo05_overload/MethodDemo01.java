package com.itheima.demo05_overload;

/**
 * 方法重载入门: 不使用方法重载
 *
 * 方法重载概述：
 * 1.同一个类中出现
 * 2.方法名相同
 * 3.参数列表不同（两种情况：参数个数不同，对应数据类型不同）
 * 4.两个或者以上的方法，称为方法重载
 * 5.方法重载和方法的返回值的数据类型无关
 *
 * 应用场景：
 * 实际开发中，我们发现某些方法的功能是类似的，每个方法都单独设置一个名字是非常麻烦的，也不方便记忆
 * 针对这种情况，我们可以采用 方法重载来解决，只要保证：方法名相同，参数列表不同即可
 * 这样当我们调用该方法时，会根据传入的参数，来调用对应的方法
 *
 * victory 2021/4/23 10:46
 */
public class MethodDemo01 {

    public static void main(String[] args) {
        System.out.println(compareInt(13, 15));
    }


    /*
    * 以下没有采用方法重载，方法名称各不相同，很繁琐
    * */
    public static boolean compareByte(byte b1, byte b2) {
        return b1 == b2;
    }

    public static boolean compareShort(short s1, short s2) {
        return s1 == s2;
    }

    public static boolean compareInt(int i1, int i2) {
        return i1 == i2;
    }

    public static boolean compareLong(long l1, long l2) {
        return l1 == l2;
    }

}
