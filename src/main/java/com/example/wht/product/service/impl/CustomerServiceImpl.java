package com.example.wht.product.service.impl;

import com.example.wht.product.dao.CustomerMapper;
import com.example.wht.product.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/12/2-22:26
 * @description
 */
@Service(value = "customerService")
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerDao;

    @Override
    public List findAllCustomer() {
        return customerDao.getAllCustomer();
    }

    @Override
    public List findCustomerByName(String name) {
        return customerDao.findCustomerByName(name);
    }
}
