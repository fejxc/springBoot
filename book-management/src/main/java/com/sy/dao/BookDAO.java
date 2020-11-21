package com.sy.dao;

import com.sy.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDAO {
    //添加图书
    void add(Book book);
    //查询所有
    List<Book> findAll();
    //根据id删除
    void delete(String id);
}
