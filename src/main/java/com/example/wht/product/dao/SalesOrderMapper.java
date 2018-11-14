package com.example.wht.product.dao;

import com.example.wht.product.pojo.SalesOrder;

public interface SalesOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SalesOrder record);

    int insertSelective(SalesOrder record);

    SalesOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SalesOrder record);

    int updateByPrimaryKey(SalesOrder record);
}