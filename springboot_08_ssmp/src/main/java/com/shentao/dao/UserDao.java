package com.shentao.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shentao.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao extends BaseMapper<User> {

//    @Select("select * from user where id = #{id}")
//    //1529102842189651970
//    User getById(long id);
}
