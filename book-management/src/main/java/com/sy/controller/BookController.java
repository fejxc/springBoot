package com.sy.controller;

import com.sy.entity.Book;
import com.sy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@CrossOrigin
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService service;

    //添加图书
    @RequestMapping("add")
    public void save(@RequestBody Book book){
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
    //修改图书
    @RequestMapping("update")
    public void update(@RequestBody Book book){
        service.update(book);
    }
    //分页查询
    @GetMapping("findByPage")
    public Map<String,Object> findByPage(Integer pageNow, Integer pageSize){
        Map<String,Object> results = new HashMap<>();
        pageNow = pageNow == null?1:pageNow;  //避免空指针
        pageSize = pageSize == null?6:pageSize;  //避免空指针
        List<Book> books=service.findByPage(pageNow,pageSize);
        Long totals = service.findTotals();
        results.put("books",books);
        results.put("totals",totals);
        return results;
    }

}
