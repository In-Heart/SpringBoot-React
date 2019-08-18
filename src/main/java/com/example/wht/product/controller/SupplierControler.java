package com.example.wht.product.controller;

import com.example.wht.common.response.Result;
import com.example.wht.product.pojo.Product;
import com.example.wht.product.pojo.ProductSupplier;
import com.example.wht.product.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/5/7-14:57
 * @description 供应商/进货商
 */
@RestController
@RequestMapping(value = {"/supplier"})
public class SupplierControler {

    @Autowired
    private ISupplierService supplierService;

    @RequestMapping(value = "/getAllSupplier", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.DELETE)
    private Result getAllSupplier(){
        List<ProductSupplier> suppliers = supplierService.getAllSupplier();
        if(suppliers != null){
            return new Result(suppliers);
        }
        return new Result(new ProductSupplier());
    }

    @RequestMapping(value = "/findSupplierByName", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.DELETE)
    private Result findSupplierByName(String name){
        List<ProductSupplier> suppliers = supplierService.findSupplierByName(name);
        if(suppliers != null){
            return new Result(suppliers);
        }
        return new Result(new ProductSupplier());
    }

    @RequestMapping(value = "/findSupplierById", produces = {"application/json;charset=UTF-8"},
            method = RequestMethod.DELETE)
    private Result findSupplierById(Integer id){
        ProductSupplier supplier = supplierService.findSupplierById(id);
        if(supplier != null){
            return new Result(supplier);
        }
        return new Result(new ProductSupplier());
    }
}
