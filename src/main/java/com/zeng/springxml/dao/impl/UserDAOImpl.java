package com.zeng.springxml.dao.impl;

import com.zeng.springxml.dao.UserDAO;

/**
 * XML方式注入外部bean
 *
 * @author a12345
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void select() {
        System.out.println("UserDAO中select方法执行了...");
    }
}
