package com.example.wht.product.dao;

import com.example.wht.product.pojo.PurchaseList;

public interface PurchaseListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseList record);

    int insertSelective(PurchaseList record);

    PurchaseList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PurchaseList record);

    int updateByPrimaryKey(PurchaseList record);
}