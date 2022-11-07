package com.shentao.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.shentao.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.w3c.dom.UserDataHandler;

@Mapper

public interface BookDao extends BaseMapper<Book> {

}
