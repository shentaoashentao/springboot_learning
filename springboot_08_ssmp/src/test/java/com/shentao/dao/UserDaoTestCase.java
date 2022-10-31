package com.shentao.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserDaoTestCase {

    @Autowired
    private UserDao userDao;
    @Test
    void testGetById(){
        System.out.println(userDao.selectById(12536));
    }

    @Test
    void testGetAll(){
        userDao.selectList(null);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(1,2);
        //queryWrapper 查询条件
        userDao.selectPage(page,null);
    }
}
