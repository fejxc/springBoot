package com.example.controller;

import com.example.enity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @GetMapping("findAll")
    public List<User> finaAll(){
        System.out.println("查询所有。。。");

        List<User> list = Arrays.asList(  new User("21","sunyun",23,new Date()),
                new User("22","sunhu",25,new Date()),
                new User("23","sunmei",26,new Date())
        );
        return list;
    }

}
