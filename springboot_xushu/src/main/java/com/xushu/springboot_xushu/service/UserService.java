package com.xushu.springboot_xushu.service;

import com.xushu.springboot_xushu.pojo.User;
import com.xushu.springboot_xushu.pojo.dto.UserDto;
import com.xushu.springboot_xushu.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service  //spring 的bean
public class UserService implements IUserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public User add(UserDto user) {

        User userPojo=new User();
        BeanUtils.copyProperties(user,userPojo);
        //调用数据访问方法
        return userRepository.save(userPojo);
    }

    @Override
    public User getUser(Integer userId) {
       return userRepository.findById(userId).orElseThrow(() ->{
           throw new IllegalArgumentException("用户不存在，参数异常！");
        });
    }

    @Override
    public User edit(UserDto user) {
        User userPojo=new User();
        BeanUtils.copyProperties(user,userPojo);
        //调用数据访问方法
        return userRepository.save(userPojo);
    }

    @Override
    public void delete(Integer userId) {
        userRepository.deleteById(userId);
    }
//    @Override
//    public String update(UserDto user){
//        userRepository.save()
//    }
}
