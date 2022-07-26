package com.thirdparty.suggestion.service;

import com.thirdparty.suggestion.model.Product;
import com.thirdparty.suggestion.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> productSuggestion(String category) {
        return productRepository.productSuggestion(category);
    }

}
