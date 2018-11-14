package com.example.wht.product.dao;

import com.example.wht.product.pojo.SalesList;

public interface SalesListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesList record);

    int insertSelective(SalesList record);

    SalesList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SalesList record);

    int updateByPrimaryKey(SalesList record);
}