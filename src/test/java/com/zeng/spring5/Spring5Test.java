package com.zeng.spring5;

import com.zeng.springioc.User;
import com.zeng.springxml.Book;
import com.zeng.springxml.Car;
import com.zeng.springxml.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.reflect.generics.tree.VoidDescriptor;

public class Spring5Test {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = applicationContext.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

    /**
     * 基于XML方式注入属性(set方式注入属性)
     */
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
        car.printAttributes();
        car.accelerate();
    }

    /**
     * 基于XML方式注入属性(通过有参构造方式注入属性)
     */
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
        book.printAttributes();
        book.workBook("张三");
    }

    /**
     * XML方式注入外部bean
     */
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.send();
    }
}
