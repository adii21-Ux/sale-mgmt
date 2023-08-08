package com.salemgmt.campaignmanagement.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.salemgmt.campaignmanagement.model.Product;
import java.util.List;

@AllArgsConstructor
@Data
public class ProductPageResponse {
    private List<Product> products;
    private int page;
    private int pageSize;
    private int totalPages;
}

