package com.xushu.springboot_xushu.pojo.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class UserDto {



    @NotNull(message = "id 不能为空")
    @Pattern(regexp = "[0-9]+]")
    private Integer userId;
    @NotBlank(message = "用户名不能为空")  //去除空格
    private String username;
    @NotBlank(message = "密码不能为空")  //去除空格
    @Length(min=6,max=12)
    private String password;
    @Email(message = "email格式不正确")
    private String email;

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
