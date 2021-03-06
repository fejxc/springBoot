package com.sy.service;

import com.sy.dao.BookDAO;
import com.sy.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired(required = false)
    private BookDAO bookDAO;

    @Override
    public void add(Book book) {
        bookDAO.add(book);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public void delete(String id) {
            bookDAO.delete(id);
    }

    @Override
    public void update(Book book) {
            bookDAO.update(book);
    }

    @Override
    public List<Book> findByPage(Integer pageNow, Integer rows) {
        int start = (pageNow-1)*rows;
        return bookDAO.findByPage(start,rows);
    }

    @Override
    public Long findTotals() {
        return bookDAO.findTotals();
    }
}
