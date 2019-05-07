package com.example.wht.product.dao;

import com.example.wht.product.pojo.ProductSupplier;

import java.util.List;

public interface ProductSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductSupplier record);

    int insertSelective(ProductSupplier record);

    ProductSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductSupplier record);

    int updateByPrimaryKey(ProductSupplier record);

    List findAllSupplier();

    List findSupplierByName(String name);
}