package com.zeng.springioc;

/**
 * 入门案列
 * IOC(控制反转)-把对象创建过程和对象之间的调用,交给Spring管理,目的是为了降低程序之间的耦合度
 * 底层原理利用了:1.反射,2.工厂模式,3.XML解析等
 * IOC容器就是对象工厂
 *
 * BeanFactory是Spring容器根接口,加载配置文件的时候不会<立即>创建对象,只会在获取使用的时候才会创建对象
 * ApplicationContext是BeanFactory的子接口,加载配置文件的时候就会立即创建对应对象
 *
 * Bean管理:  1.创建对象  2.属性注入
 * @author Mr-Zeng
 */
public class User {

    public void add(){
        System.out.println("add...!");
    }
}
