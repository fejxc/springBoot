package com.example;

import com.example.entity.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        userService.findAll().forEach(user -> System.out.println("user = "+user));
    }


    @Test
    public void testSave(){
        User user = new User();
        user.setId("3");
        user.setAddress("江西玉山");
        user.setBir(new Date());
        user.setName("花花");
        user.setSex("男");
        userService.save(user);
    }

    @Test
    public void testDelete(){
        userService.delete("6");
    }
}
