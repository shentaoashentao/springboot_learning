package com.shentao.controller;

import com.shentao.dao.UserDao;
import com.shentao.domain.User;
import com.shentao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private IUserService userService;


    //查询使用Get请求
    @GetMapping
    public List<User> getAll(){
        return userService.list();
    }

    //添加用Post
    @PostMapping
    public Boolean save(@RequestBody User user){
        return userService.save(user);
    }


    //更新用Put
    @PutMapping
    public Boolean update(@RequestBody User user){
        return userService.update(user ,null);
    }

    //删除用Delete
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
    }

    //根据id查询
    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        return userService.getById(id);
    }
}
