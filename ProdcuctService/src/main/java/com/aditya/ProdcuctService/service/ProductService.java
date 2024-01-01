package com.aditya.ProdcuctService.service;

import com.aditya.ProdcuctService.model.ProductRequest;
import com.aditya.ProdcuctService.model.ProductResponse;
import org.springframework.stereotype.Service;

public interface ProductService {

    long addProduct(ProductRequest productRequest) ;
    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
