package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {
//    查询所有
        List<User> findAll();

        //保存用户
        void save(User user);

        //删除用户 根据id
        void delete(String id);

        void update(User user);
}
