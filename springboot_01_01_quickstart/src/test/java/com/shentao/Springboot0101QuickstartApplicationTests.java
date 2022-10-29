package com.shentao;

import com.shentao.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.soap.Addressing;

@SpringBootTest(classes = Springboot0101QuickstartApplication.class)
class Springboot0101QuickstartApplicationTests {

    //1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        //2.执行要测试的对象对应的方法
        bookDao.save();
    }
}
