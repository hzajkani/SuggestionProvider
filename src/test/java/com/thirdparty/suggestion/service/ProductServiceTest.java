package com.thirdparty.suggestion.service;

import com.thirdparty.suggestion.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceTest {

    private static final Long DEFAULT_ID = 1L;
    private static final String DEFAULT_NAME = "donut";
    private static final String DEFAULT_CATEGORY = "food";

    @Autowired
    private ProductService productService;


    @Test
    void productSuggestionWithCategory() {
        List<Product> products = productService.productSuggestionWithCategory(DEFAULT_CATEGORY);
        Optional<Product> optionalProduct = products.stream().findAny();

        assertEquals(optionalProduct.get().getCategory(), DEFAULT_CATEGORY);

    }
}