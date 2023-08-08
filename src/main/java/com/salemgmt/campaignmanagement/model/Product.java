package com.salemgmt.campaignmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue
    private int product_id;
    private String title;
    private String description;
    private int price;
    private int current_price;
    private int discount;
    private int invenrtory_count;
}
