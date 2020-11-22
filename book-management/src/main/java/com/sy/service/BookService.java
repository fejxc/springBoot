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
    //更新图书
    void update(Book book);

    //分页查询
    List<Book> findByPage(Integer pageNow, Integer rows);
    //查询总条数
    Long findTotals();
}
