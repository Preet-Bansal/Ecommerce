package com.example.Ecom.service;

import com.example.Ecom.model.Product;
import com.example.Ecom.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepo repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {

        return repo.findById(id).orElse(new Product());
    }
}
