package com.marufotomasyon.marketing_app.business.abstracts;

import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.core.results.Result;
import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {

    DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll();
}
