package com.example.wht.product.controller;

import com.example.wht.common.response.Result;
import com.example.wht.product.pojo.Customer;
import com.example.wht.product.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/12/2-22:26
 * @description 客户相关
 */
@RestController
@RequestMapping(value = {"/customer"})
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/findAllCustomer", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.DELETE)
    public Result getAllCustomer(){
        List<Customer> customerList = customerService.findAllCustomer();
        return new Result(customerList);
    }

    @RequestMapping(value = "/findCustomerByName", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.DELETE)
    public Result findCustomerByName(String name){
        List<Customer> customerList = customerService.findCustomerByName(name);
        return new Result(customerList);
    }
}
