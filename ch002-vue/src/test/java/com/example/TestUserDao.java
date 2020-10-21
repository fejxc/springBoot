package com.example;

import com.sunyun.Ch002VueApplication;
import com.sunyun.dao.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Ch002VueApplication.class)
public class TestUserDao {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void testFindAll(){
        userDAO.findAll().forEach(user -> System.out.println("user = " + user));
    }
}
