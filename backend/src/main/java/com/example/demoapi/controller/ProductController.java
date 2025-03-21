package com.example.demoapi.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.demoapi.entities.*;

@RestController
public class ProductController {

    @CrossOrigin
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        var data = new ArrayList<Product>();
        data.add(new Product(1,"Laptop",1, 20000));
        data.add(new Product(2, "Display", 1, 10000));
        data.add(new Product(3,"Keyboard",1,  600));
        data.add(new Product(4, "Java Stickies", 5, 199));
        data.add(new Product(5, "Jolt Cola", 24, 249));
        data.add(new Product(6, "Cat Shampoo", 1, 99));
        data.add(new Product(7, "Dog Shampoo", 1, 79));
        return ResponseEntity.ok().body(data);
    }


}
