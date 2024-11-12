package com.xushu.springboot_xushu.service;

import com.xushu.springboot_xushu.pojo.User;
import com.xushu.springboot_xushu.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 增加
     *
     * @return
     */
    User add(UserDto user);
//查询用户
    User getUser(Integer userId);
    //修改用户
    User edit(UserDto user);
//删除用户
    void delete(Integer userId);
}
