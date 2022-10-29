package com.shentao.dao.impl;

import com.shentao.dao.BookDao;

public class BookDaoImpl implements BookDao {
    //运行报错  spring创建bean的时候 调用的是无参构造
//    public BookDaoImpl(int i ){
//        System.out.println("aaaaaaa");
//    }
    public void save(){
        System.out.println("book dao save....");
    }
}
