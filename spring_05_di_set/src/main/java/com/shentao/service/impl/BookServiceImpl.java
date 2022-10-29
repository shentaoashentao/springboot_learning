package com.shentao.service.impl;

import com.shentao.dao.BookDao;
import com.shentao.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookServiceImpl bookDao) {
    }

    @Override
    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }
}
