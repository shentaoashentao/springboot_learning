package com.shentao.dao;

import com.shentao.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    //1529102842189651970
    User getById(long id);
}
