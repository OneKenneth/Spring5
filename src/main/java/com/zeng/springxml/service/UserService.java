package com.zeng.springxml.service;

import com.zeng.springxml.dao.UserDAO;

/**
 * XML方式注入外部bean
 *
 * @author Mr-Zneg
 */
public class UserService {

    private UserDAO userDAO;
    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public void send(){
        System.out.println("userService中send方法执行...");
        userDAO.select();
    }
}
