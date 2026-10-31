package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{
    private final List<Product> products = List.of(
            new Product(1L,"Laptop Dell",1500),
            new Product(2L,"iPhone 15",1200),
            new Product(3L,"Chuột Logitech",25)
    );

    public List<Product> getAllProducts(){
        return products;
    }
}
