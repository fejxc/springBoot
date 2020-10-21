package com.sunyun.controller;

import com.sunyun.entity.User;
import com.sunyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@CrossOrigin//跨域标志
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有方法
    @GetMapping("findAll")
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }

    //保存用户
    @PostMapping("save")
    public Map<String,Object> save(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        try {
            userService.save(user);
            map.put("ok",true);
        }catch (Exception e){
            map.put("error",false);
            map.put("message","保存失败");
        }
        return map;

    }

    //删除方法
    @GetMapping("delete")
    public Map<String,Object> delete(String id){
        Map<String,Object> map = new HashMap<>();
        try {
            userService.delete(id);
            map.put("status",true);
        }catch (Exception e){
            map.put("status",false);
            map.put("message","删除失败");
        }
        return map;
    }
}
