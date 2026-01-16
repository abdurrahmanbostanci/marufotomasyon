package com.marufotomasyon.marketing_app.api.controllers;

import com.marufotomasyon.marketing_app.business.abstracts.BrandService;
import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/brands")
@CrossOrigin
public class BrandsController {

    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        super();
        this.brandService = brandService;
    }

    @GetMapping("/getByBrandName")
    public DataResult<Brand> getByBrandName(@RequestParam String brandName) {
        return this.brandService.getByBrandName(brandName);
    }

}
