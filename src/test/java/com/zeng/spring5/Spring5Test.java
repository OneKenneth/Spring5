package com.zeng.spring5;

import com.zeng.springioc.User;
import com.zeng.springxml.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = applicationContext.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
        car.printAttributes();
        car.accelerate();
    }
}
