package com.example.wht.product.service;

import com.example.wht.product.pojo.ProductSupplier;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/5/7-15:03
 * @description
 */
public interface ISupplierService {
    List getAllSupplier();

    List findSupplierByName(String name);

    ProductSupplier findSupplierById(Integer id);
}
