package com.example.Ecom.controller;

import com.example.Ecom.model.Product;
import com.example.Ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {


    @Autowired
    ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "Welcome";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }


}
