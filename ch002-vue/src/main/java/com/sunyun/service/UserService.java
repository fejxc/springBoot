package com.sunyun.service;

import com.sunyun.entity.User;
import sun.nio.cs.US_ASCII;

import java.util.List;

public interface UserService {
    //查询所有用户
    List<User> findAll();
    //保存用户
    void save(User user);
    //删除蝇虎
    void delete(String id);
    //根据id查询用户
    User findOne(String id);
    //修改用户
    void update(User user);
    //模糊搜索
    List<User> findNameOrPhoneCode(String name,String code);
}
