package com.sy.controller;


import com.sy.entity.Book;
import com.sy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService service;

    //添加图书
    @RequestMapping("add")
    public void save(Book book){
        service.add(book);
    }

    //查询所有
    @RequestMapping("findAll")
    public List<Book> findAll(){
        return service.findAll();
    }

    //根据id进行删除
    @RequestMapping("delete")
    public void delete(String id){
        service.delete(id);
    }
}
