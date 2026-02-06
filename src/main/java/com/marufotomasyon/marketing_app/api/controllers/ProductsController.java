package com.marufotomasyon.marketing_app.api.controllers;

import com.marufotomasyon.marketing_app.business.abstracts.ProductService;
import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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
    public DataResult<Page<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll(@RequestParam(required = false) Integer categoryId,
                                                                                 @RequestParam(required = false) Integer subcategoryId,
                                                                                 @RequestParam(required = false) List<Integer> brandId,
                                                                                 @PageableDefault(page= 0, size = 20, sort = "p.id", direction = Sort.Direction.ASC)
                                                                                 Pageable pageable) {
        return productService.getAll(categoryId, subcategoryId, brandId, pageable);
    }

    @GetMapping("/getallwithoutpages")
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAllWithoutPages(@RequestParam(required = false) Integer categoryId,
                                                                                             @RequestParam(required = false) Integer subcategoryId,
                                                                                             @RequestParam(required = false) List<Integer> brandId) {
        return productService.getAllWithoutPages(categoryId, subcategoryId, brandId);
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
