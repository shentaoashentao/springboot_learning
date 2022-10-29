package com.shentao.service.impl;

import com.shentao.dao.UserDao;

public class UserServiceImpl {
    private UserDao userDao;
    public void setUserDao(UserServiceImpl userDao) {
    }

    public void save() {
        System.out.println("user service save");
        userDao.save();
    }
}
