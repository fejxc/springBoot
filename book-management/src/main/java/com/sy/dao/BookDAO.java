package com.sy.dao;

import com.sy.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookDAO {
    //添加图书
    void add(Book book);
    //查询所有
    List<Book> findAll();
    //根据id删除
    void delete(String id);
    //更新图书
    void update(Book book);

    //分页查询
    List<Book> findByPage(@Param("start")Integer start, @Param("rows")Integer rows);

    //查询总条数
    Long findTotals();
}
