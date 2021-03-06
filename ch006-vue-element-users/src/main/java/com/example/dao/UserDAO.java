package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserDAO
{
    //查询所有用户信息
    List<User> findAll();

    //保存用户
    void save(User user);

    //删除用户 根据id
    void delete(String id);

    //更新用户
    void update(User user);

    //分页查询
    List<User> findByPage(@Param("start")Integer start,@Param("rows")Integer rows);
    //查询总条数
    Long findTotals();
}
