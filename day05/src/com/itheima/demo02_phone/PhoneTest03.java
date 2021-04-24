package com.itheima.demo02_phone;

/**
 * 案例：演示两个引用指向同一个对象的内存图
 *
 * victory 2021/4/24 11:42
 */
public class PhoneTest03 {

    public static void main(String[] args) {

        //1.创建手机类的对象
        Phone p1 = new Phone();
        //2.设置成员变量值
        p1.brand = "华为";
        p1.price = 5999;
        p1.color = "黑色";
        //3.打印成员变量值
        System.out.println(p1.brand + "--" + p1.price + "--" + p1.color);
        //4.调用成员方法
        p1.call("张三");
        p1.sendMessage("李四");
        System.out.println("--------------------------");


        Phone p2 = p1;
        //2.设置成员变量值
        p2.brand = "苹果";
        p2.price = 8888;
        p2.color = "红色";
        //3.打印成员变量值
        System.out.println(p1.brand + "--" + p1.price + "--" + p1.color);
        System.out.println(p2.brand + "--" + p2.price + "--" + p2.color);
        //4.调用成员方法
        p2.call("王五");
        p2.sendMessage("赵六");

    }

}
