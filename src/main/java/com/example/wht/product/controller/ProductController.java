package com.example.wht.product.controller;

import com.example.wht.common.response.Result;
import com.example.wht.product.pojo.Product;
import com.example.wht.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2018/11/14-18:19
 * @description 商品
 */
@RestController
@RequestMapping(value = {"/product"})
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = "/getAllProduct", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.DELETE)
    private Result getAllProduct(){
        List<Product> productList = productService.getAllProduct();
        return new Result(productList);
    }

    @RequestMapping(value = "/findProductByName", produces = {"application/json;charset=UTF-8"}
//        ,method = RequestMethod.DELETE
    )
    private Result findProductByName(String name){
        List<Product> productList;
        if(name != null){
            productList = productService.findProductByName(name);
        } else {
            productList = productService.findProductByName("");
        }
        return new Result(productList);
    }
}
