package com.salemgmt.campaignmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.salemgmt.campaignmanagement.dao.ProductRepo;
import com.salemgmt.campaignmanagement.model.Product;
import com.salemgmt.campaignmanagement.response.ProductPageResponse;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepository;

    @Autowired
    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }

    // Add multiple products
    public List<Product> addProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }


    //Get paginated product
    public ProductPageResponse getProducts(int page, int pageSize) {
        Page<Product> productPage = productRepository.findAll(PageRequest.of(page - 1, pageSize));

        return new ProductPageResponse(
            productPage.getContent(),
            productPage.getNumber() + 1,
            productPage.getSize(),
            productPage.getTotalPages()
        );
    }
}
