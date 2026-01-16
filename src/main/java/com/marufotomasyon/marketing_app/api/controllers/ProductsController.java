package com.marufotomasyon.marketing_app.api.controllers;

import com.marufotomasyon.marketing_app.business.abstracts.ProductService;
import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.entities.concretes.Brand;
import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import org.springframework.web.bind.annotation.*;

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
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll(@RequestParam(required = false) Integer categoryId,
                                                                                 @RequestParam(required = false) Integer subcategoryId,
                                                                                 @RequestParam(required = false) List<Integer> brandId) {
        return productService.getAll(categoryId, subcategoryId, brandId);
    }

    @GetMapping("/getallbyname")
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAllByName(@RequestParam(required = false) String categoryName,
                                                                                        @RequestParam(required = false) String subcategoryName,
                                                                                        @RequestParam(required = false) List<String> brandName) {
        return productService.getAllByName(categoryName, subcategoryName, brandName);
    }

    @GetMapping("/getbybrand")
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByBrand(@RequestParam int brandId) {
        return productService.getByBrand(brandId);
    }

    @GetMapping("/getByProductName")
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }

}
