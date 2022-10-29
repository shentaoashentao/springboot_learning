package com.shentao.dao.impl;

import com.shentao.dao.BookDao;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running...");
    }
}
