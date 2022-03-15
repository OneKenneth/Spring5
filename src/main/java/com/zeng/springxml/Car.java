package com.zeng.springxml;

/**
 * 基于XML方式注入属性
 * DI:Spring特性,依赖注入,本质上就是注入属性(Spring采用两种属性注入:1.set方式注入属性 2.有参构造注入属性)
 *
 * @author Mr-Zeng
 */
public class Car {

    private String color;
    private Integer speed;

    /**
     * set方式注入属性
     * @param color 参数
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    /**
     * 打印属性的方法
     */
    public void printAttributes(){
        System.out.println("color:" + color +"--"+ "speed:" + speed);
    }

    /**
     * 加速的方法
     */
    public void accelerate(){
        System.out.println("正在加速中....");
    }
}
