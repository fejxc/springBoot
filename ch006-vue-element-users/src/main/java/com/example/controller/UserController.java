package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//json格式  RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //查询所有
    @GetMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    //添加用户
    @PostMapping("save")
    public Result save(@RequestBody User user){
        Result result = new Result();
        try {
            userService.save(user);
            result.setMsg("添加成功！");
        }catch (Exception e){
            result.setStatus(false);
            result.setMsg("添加失败！");
        }
        return result;
    }

    //更新用户
    @PostMapping("update")
    public Result update(@RequestBody User user){
        Result result = new Result();
        try {
            userService.update(user);
            result.setMsg("更新成功！");
        }catch (Exception e){
            result.setStatus(false);
            result.setMsg("更新失败！");
        }
        return result;
    }

    //删除用户
    @GetMapping("delete")
    public Result delete(String id){
        Result result = new Result();
        try{
            userService.delete(id);
            result.setMsg("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(false);
            result.setMsg("删除失败，请等会在删除");
        }
        return result;
    }
}
