package com.example.wht.user.service.impl;

import com.example.wht.user.dao.RoleMapper;
import com.example.wht.user.pojo.Role;
import com.example.wht.user.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/19-11:04
 * @description
 */
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleDao;

    @Override
    public List findAllRole() {
        return roleDao.findAllRoles();
    }

    @Override
    public int addRole(Role role) {
        return 0;
    }

    @Override
    public int updateRole(Role role) {
        return 0;
    }
}
