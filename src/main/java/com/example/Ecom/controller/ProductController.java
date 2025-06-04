package com.example.Ecom.controller;

import com.example.Ecom.model.Product;
import com.example.Ecom.service.ProductService;
import lombok.experimental.PackagePrivate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product>  getProduct(@PathVariable int id){

        Product product = service.getProductById(id);
        if(product != null)
        return new ResponseEntity<> (product, HttpStatus.FOUND);
        else
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
