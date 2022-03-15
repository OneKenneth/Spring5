package com.zeng.springxml;

/**
 * 基于XML方式注入属性(通过有参构造方式注入属性)
 *
 * @author a12345
 */
public class Book {

    private String bookName;
    private Integer price;

    /**
     * 有参构造
     * @param bookName 参数1
     * @param price 参数2
     */
    public Book(String bookName,Integer price){
        this.bookName = bookName;
        this.price = price;
    }

    /**
     * 打印属性方法
     */
    public void printAttributes(){
        System.out.println("书名:" + bookName +"--"+ "价格:" + price);
    }

    /**
     * 看书方法
     * @param name 参数
     */
    public void workBook(String name){
        System.out.println(name+"正在看书");
    }
}
