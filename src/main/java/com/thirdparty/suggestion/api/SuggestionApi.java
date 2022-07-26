package com.thirdparty.suggestion.api;

import com.thirdparty.suggestion.model.Product;
import com.thirdparty.suggestion.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suggestion")
public class SuggestionApi {

    private final ProductService productService;

    public SuggestionApi(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}/{name}/{category}")
    public List<Product> productSuggestion(@PathVariable("id") Long id, @PathVariable("name") String name, @PathVariable("category") String category) {
        List<Product> productList = productService.productSuggestion(category);

        return productList;
    }
}
