package com.example.wht.user.service;

import com.example.wht.user.dao.UserMapper;
import com.example.wht.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/9/15-13:19
 * @description
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userDao;//这里可能会报错，但是并不会影响

    @Override
    public List findAllUser() {
        return userDao.findAllUser();

    }

    @Override
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }
}
