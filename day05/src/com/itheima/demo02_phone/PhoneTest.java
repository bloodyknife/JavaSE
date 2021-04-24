package com.itheima.demo02_phone;

/**
 * 案例：手机类的测试类
 * victory 2021/4/24 10:45
 */
public class PhoneTest {

    public static void main(String[] args) {
        //1.创建手机类的对象
        Phone p = new Phone();

        //2.设置成员变量值
        p.brand = "华为";
        p.price = 5999;
        p.color = "黑色";

        //3.打印成员变量值
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);

        //4.调用成员方法
        p.call("张三");
        p.sendMessage("李四");
    }

}
