package com.salemgmt.campaignmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salemgmt.campaignmanagement.model.Product;
import com.salemgmt.campaignmanagement.response.ProductPageResponse;
import com.salemgmt.campaignmanagement.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //endpoint to add multiple products
    @PostMapping("/add-products")
    public ResponseEntity<String> addMultipleProducts(@RequestBody List<Product> products) {
        List<Product> savedProducts = productService.addProducts(products);
        if (savedProducts.isEmpty()) {
            return new ResponseEntity<>("Failed to add products.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Products added successfully.", HttpStatus.CREATED);
    }

    //endpdoint to get paginated data
    @GetMapping("/products")
    public ProductPageResponse getProducts(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int pageSize) {
        return productService.getProducts(page, pageSize);
    }
}
