package com.sy.controller;

import com.sy.entity.Book;
import com.sy.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    //添加图书
    @RequestMapping("add")
    public void save(@RequestBody Book book){
        service.add(book);
        logger.info("添加成功");

    }

    //查询所有
    @RequestMapping("findAll")
    public List<Book> findAll(){
        logger.info("查询成功");
        return service.findAll();
    }

    //根据id进行删除
    @RequestMapping("delete")
    public void delete(String id){
        service.delete(id);
        logger.info("删除成功");
    }
    //修改图书
    @RequestMapping("update")
    public void update(@RequestBody Book book){
        service.update(book);
        logger.info("修改成功");
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
