package com.sunyun.dao;

import com.sunyun.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {

    //查询所有
    List<User> findAll();

    //保存用户
    void save(User user);

    //删除用户
    void delete(String id);

    //根据id查询一个人
    User findOne(String id);

    //根据id信息进行修改更新
    void update(User user);

    //根据姓名或电话搜索
    List<User> findNameOrPhoneCode(@Param("name") String name,@Param("code") String phoneCode);
}
