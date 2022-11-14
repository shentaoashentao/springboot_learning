package com.shentao.controller;

import com.shentao.config.utils.R;
import com.shentao.domain.Book;
import com.shentao.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;


    //查询使用Get请求
    @GetMapping
    public R getAll(){

        return new R(true,bookService.list());
    }

    //添加用Post
    @PostMapping
    public R save(@RequestBody Book book){
        return new R (bookService.save(book));
    }


    //更新用Put
    @PutMapping
    public R update(@RequestBody Book book){
        //return bookService.update(book ,null);
        return new R( bookService.updateById(book));
    }

    //删除用Delete
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
       // return bookService.removeById(id);
        return new R(bookService.removeById(id));
    }

    //根据id查询
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        //return bookService.getById(id);
        return new R(true,bookService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,bookService.getPage(currentPage,pageSize));
    }
}
