package com.example.service;

import com.example.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
//    查询所有
        List<User> findAll();

        //保存用户
        void save(User user);

        //删除用户 根据id
        void delete(String id);

        void update(User user);
        //分页查询
        List<User> findByPage(Integer pageNow, Integer rows);
        //查询总条数
        Long findTotals();
}
