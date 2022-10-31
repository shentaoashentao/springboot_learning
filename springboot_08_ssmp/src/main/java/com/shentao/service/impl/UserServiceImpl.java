package com.shentao.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shentao.dao.UserDao;
import com.shentao.domain.User;
import com.shentao.service.IUserService;
import com.shentao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements IUserService {

//    @Autowired
//    private UserDao userDao;
//
//    @Override
//    public Boolean save(User user) {
//        //因为save 返回的都是int型 所以选择>0 来表示 更没更新
//        return userDao.insert(user) > 0 ;
//    }
//
//    @Override
//    public Boolean update(User user) {
//        return userDao.updateById(user) > 0 ;
//    }
//
//    @Override
//    public Boolean delete(Integer id) {
//        return userDao.deleteById(id) > 0 ;
//    }
//
//    @Override
//    public User getById(Integer id) {
//        return userDao.selectById(id);
//    }
//
//    @Override
//    public List<User> getAll() {
//        return userDao.selectList(null );
//    }
}
