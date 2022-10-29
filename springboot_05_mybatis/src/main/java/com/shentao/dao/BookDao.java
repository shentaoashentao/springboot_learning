package com.shentao.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
@Mapper
public interface BookDao {

    @Select("select * from employee where id = #{id}")
    public Book geiById(Integer id);
}
