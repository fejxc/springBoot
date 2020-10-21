package com.sunyun.dao;

import com.sunyun.entity.User;

import java.util.List;

public interface UserDAO {

    //查询所有
    List<User> findAll();

    //保存用户
    void save(User user);

    //删除用户
    void delete(String id);
}
