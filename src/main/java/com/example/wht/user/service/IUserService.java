package com.example.wht.user.service;

import com.example.wht.user.pojo.User;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/9/15-13:16
 * @description
 */
public interface IUserService {
    List findAllUser();
    Integer addUser(User user);
    int insert(User record);

    int insertSelective(User record);
}
