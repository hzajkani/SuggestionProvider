package com.thirdparty.suggestion.repository;

import com.thirdparty.suggestion.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {

    private static final Map<String, List<Product>> products = new HashMap();

    public ProductRepository() {
        init();
    }

    private void init() {
        List<Product> foods = new ArrayList<>();

        foods.add(
                Product.builder()
                        .id(1L)
                        .name("donut1")
                        .category("food")
                        .build());
        foods.add(
                Product.builder()
                        .id(2L)
                        .name("donut2")
                        .category("food")
                        .build());
        foods.add(
                Product.builder()
                        .id(3L)
                        .name("donut3")
                        .category("food")
                        .build());
        foods.add(
                Product.builder()
                        .id(4L)
                        .name("donut4")
                        .category("food")
                        .build());
        foods.add(
                Product.builder()
                        .id(5L)
                        .name("donut5")
                        .category("food")
                        .build());

        products.put("food", foods);

    }


    public List<Product> productSuggestion(String category) {
        return products.get(category);
    }
}
