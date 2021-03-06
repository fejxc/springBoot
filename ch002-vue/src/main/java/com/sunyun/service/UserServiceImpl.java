package com.sunyun.service;


import com.sunyun.dao.UserDAO;
import com.sunyun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional //控制事物
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
    }

    @Override
    public void delete(String id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findOne(String id) {
        return userDAO.findOne(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS) //查询，支持事务
    public List<User> findNameOrPhoneCode(String name,String code) {
        return userDAO.findNameOrPhoneCode(name,code);
    }
}
