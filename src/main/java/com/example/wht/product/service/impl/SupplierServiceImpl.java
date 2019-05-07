package com.example.wht.product.service.impl;

import com.example.wht.product.dao.ProductSupplierMapper;
import com.example.wht.product.pojo.ProductSupplier;
import com.example.wht.product.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/5/7-15:04
 * @description
 */
@Service(value = "supplierService")
public class SupplierServiceImpl implements ISupplierService {

    @Autowired
    private ProductSupplierMapper supplierMapper;

    @Override
    public List getAllSupplier() {
        return supplierMapper.findAllSupplier();
    }

    @Override
    public List findSupplierByName(String name) {
        return supplierMapper.findSupplierByName(name);
    }

    @Override
    public ProductSupplier findSupplierById(Integer id) {
        return supplierMapper.selectByPrimaryKey(id);
    }
}
