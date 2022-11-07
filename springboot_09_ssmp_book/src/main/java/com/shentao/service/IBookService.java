package com.shentao.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shentao.domain.Book;
import org.springframework.stereotype.Service;


public interface IBookService extends IService<Book> {
    IPage<Book> getPage(int currentPage,int pageSize);
}
