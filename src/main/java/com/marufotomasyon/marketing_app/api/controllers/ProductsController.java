package com.marufotomasyon.marketing_app.api.controllers;

import com.marufotomasyon.marketing_app.business.abstracts.ProductService;
import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll() {
        return productService.getAll();
    }

}
