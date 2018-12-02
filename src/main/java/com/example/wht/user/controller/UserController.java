package com.example.wht.user.controller;

import com.example.wht.common.controller.BaseController;
import com.example.wht.common.response.Constants;
import com.example.wht.common.response.Result;
import com.example.wht.common.utils.AES;
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
    public Result getAllUsers(){
        List<User> users = userService.findAllUser();
        return new Result(users);
    }

    @RequestMapping(value = {"/addUser"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public Result addUser(User user) throws Exception{
        String userPwd = user.getPwd();
        user.setPwd(AES.encrptPwd(userPwd));
        int code = userService.addUser(user);
        if (code == 1){
            return Result.SUCCESS("新增用户成功");
        }else{
            return Result.ERROR("新增用户失败");
        }
    }

    @RequestMapping(value = {"/deleteUserById"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public Result deleteUserById(int userId){
        int code = userService.deleteUserById(userId);
        if (code == 1){
            return Result.SUCCESS("删除用户成功");
        }else{
            return Result.ERROR("删除用户失败");
        }
    }
}
