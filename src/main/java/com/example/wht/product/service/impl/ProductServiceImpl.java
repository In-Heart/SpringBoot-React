package com.example.wht.product.service.impl;

import com.example.wht.product.dao.ProductMapper;
import com.example.wht.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/2/12-16:01
 * @description
 */
@Service(value = "productService")
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List getAllProduct() {
        return productMapper.getAllProduct();
    }

    @Override
    public List findProductByName(String name) {
        return productMapper.findProductByName(name);
    }
}
