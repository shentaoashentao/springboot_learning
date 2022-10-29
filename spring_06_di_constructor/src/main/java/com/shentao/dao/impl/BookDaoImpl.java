package com.shentao.dao.impl;

import com.shentao.dao.BookDao;
import org.springframework.stereotype.Component;

//@Component表示配置了一个bean
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;


    @Override
    public void save() {
        System.out.println("book dao save..");
    }
}
