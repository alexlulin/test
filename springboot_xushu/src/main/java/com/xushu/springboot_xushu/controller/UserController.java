package com.xushu.springboot_xushu.controller;

import com.xushu.springboot_xushu.pojo.ResponseMessage;
import com.xushu.springboot_xushu.pojo.User;
import com.xushu.springboot_xushu.pojo.dto.UserDto;
import com.xushu.springboot_xushu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController //接口方法返回对象 转换成json文本
@RequestMapping("/user")  // localhost:8080/user/**
public class UserController {

    @Autowired
    IUserService userService;
    //REST 风格
    //增加
    @PostMapping  //url: localhost:8080/user/  moth:post
    public ResponseMessage<User> add(@Validated @RequestBody UserDto user){
        User useradd = userService.add(user);
        return ResponseMessage.success(useradd);
    }
    //查询
    @GetMapping("/{userId}")   //url: localhost:8080/user/1   moth:get
    public ResponseMessage<User> get(@PathVariable Integer userId){
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }

    //修改
    @PutMapping                        //url: localhost:8080/user/1   moth:put
    public ResponseMessage<User> edit(@Validated @RequestBody UserDto user){
        User useradd = userService.edit(user);
        return ResponseMessage.success(useradd);
    }
    //删除用户
    @DeleteMapping("/{userId}")
    public ResponseMessage<User> delete(@PathVariable Integer userId){
        userService.delete(userId);
        return ResponseMessage.success();
    }

}
