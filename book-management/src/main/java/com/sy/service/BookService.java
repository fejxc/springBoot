package com.sy.service;

import com.sy.entity.Book;

import java.util.List;

public interface BookService {
    //添加图书
    void add(Book book);
    //查询所有
    List<Book> findAll();
    //根据id删除
    void delete(String id);
}
