package com.example.wht.user.service;

import com.example.wht.user.pojo.Role;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/19-11:05
 * @description
 */
public interface IRoleService{
    List findAllRole();

    int addRole(Role role);

    int updateRole(Role role);
}
