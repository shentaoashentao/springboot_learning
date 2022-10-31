package com.shentao.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;


@Mapper
public interface BookDao {

    @Select("select * from employee where id = #{id}")
    public Book getById(Integer id);
}
