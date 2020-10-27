package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired(required=true)
    private UserService userService;
    /**
     * 查询所有
     */
    @GetMapping("findAll")
    public Map<String ,Object> findAll(Integer page,Integer rows){
        Map<String,Object> map = new HashMap<>();
        List<User> results = userService.findAll();
        map.put("total",10);
        map.put("totalPage",1);
        map.put("page",page);
        map.put("results",results);
        return map;
    }

    /**
     *
     * 添加用户
     */
    @PostMapping("add")
    public Map<String,Object> add(@RequestBody User user){
        HashMap<String,Object> map = new HashMap<>();
        try{
            userService.save(user);
            map.put("success",true);
            map.put("msg","添加成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","添加失败"+ e.getMessage());
        }
        return map;
    }

    /**
     * 删除
     */
    @GetMapping("delete")
    public Map<String,Object> delete(String id){
        HashMap<String,Object> map = new HashMap<>();
        try{
            userService.delete(id);
            map.put("success",true);
            map.put("msg","删除成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","删除失败" + e.getMessage());

        }
       return map;
    }

    /**
     * 查询一个
     */
    @GetMapping("findOne")
    public User findOne(String id){
        return userService.findById(id);
    }

    /**
     *
     *更新用户
     */
    @PostMapping("update")
    public Map<String ,Object> update(@RequestBody User user){
        HashMap<String,Object> map = new HashMap<>();
        try{
            userService.update(user);
            map.put("success",true);
            map.put("msg","更新成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","更新失败" + e.getMessage());

        }
        return map;
    }

}
