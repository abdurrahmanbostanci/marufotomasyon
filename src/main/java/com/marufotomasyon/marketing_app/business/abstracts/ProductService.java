package com.marufotomasyon.marketing_app.business.abstracts;

import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.core.results.Result;
import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryDto;

import javax.xml.crypto.Data;
import java.util.List;

public interface ProductService {

    DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll(Integer categoryId,
                                                                          Integer subcategoryId,
                                                                          List<Integer> brandId);

    DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAllByName(String categoryName,
                                                                                 String subcategoryName,
                                                                                 List<String> brandName);

    DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByBrand(int brandId);

    //DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByCategory(int categoryId);

    //DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getBySubcategory(int subcategoryId);

    //DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByCategoryAndBrand(int categoryId, int brandId);

    DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByProductName (String productName);
}
