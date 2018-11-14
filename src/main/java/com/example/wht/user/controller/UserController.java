package com.example.wht.user.controller;

import com.example.wht.user.pojo.User;
import com.example.wht.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/9/15-13:15
 * @description
 */
@RestController
@RequestMapping(value = {"/user"})
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = {"/findAllUser"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List getAllUsers(){
        return userService.findAllUser();
    }

    @RequestMapping(value = {"/addUser"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public Integer addUser(User user){
        return userService.addUser(user);
    }
}
