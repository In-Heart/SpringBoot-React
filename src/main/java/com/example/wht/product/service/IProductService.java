package com.example.wht.product.service;

import java.util.List;

/**
 * @author haitaow
 * @version 1.0.0
 * @createTime 2019/2/12-16:01
 * @description
 */
public interface IProductService {
    List getAllProduct();

    List findProductByName(String name);
}
