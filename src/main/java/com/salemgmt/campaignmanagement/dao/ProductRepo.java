package com.salemgmt.campaignmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salemgmt.campaignmanagement.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
