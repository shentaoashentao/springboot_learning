package com.shentao.controller;

import com.shentao.controller.utils.R;
import com.shentao.dao.UserDao;
import com.shentao.domain.User;
import com.shentao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class RUserController {


    @Autowired
    private IUserService userService;


    //查询使用Get请求
    @GetMapping
    public R getAll(){
        return new R(true,userService.list());
    }

    //添加用Post
    @PostMapping
    public R save(@RequestBody User user){
//        R r = new R();
//       boolean flag =  userService.save(user);
//       r.setFlag(flag);
        //return r;
        return new R(userService.save(user));
    }


    //更新用Put
    @PutMapping
    public R update(@RequestBody User user){

        return new R(userService.update(user,null));
        //return userService.update(user ,null);
    }

    //删除用Delete
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(true,userService.removeById(id));
    }

    //根据id查询
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,userService.getById(id));
    }
}
