package com.itheima.demo02_phone;

/**
 * 案例：定义手机类
 * 用来描述手机的（属性，行为），像这样的用来描述事物的类叫：实体类 / JavaBean类 / POJO
 *
 * victory 2021/4/24 10:33
 */
public class Phone {

    // 属性：也叫成员变量，就是用来描述事物的外在特征（名词）
    // 品牌、价格、颜色
    String brand;
    int price;
    String color;

    // 行为：也叫成员方法（动词）
    // 打电话
    public void call(String name) {
        System.out.println("给" + name + "打电话！...");
    }

    // 发短信
    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信！...");
    }

}
