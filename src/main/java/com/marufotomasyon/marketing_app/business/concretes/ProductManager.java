package com.marufotomasyon.marketing_app.business.concretes;

import com.marufotomasyon.marketing_app.business.abstracts.ProductService;
import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.core.results.Result;
import com.marufotomasyon.marketing_app.core.results.SuccessDataResult;
import com.marufotomasyon.marketing_app.core.results.SuccessResult;
import com.marufotomasyon.marketing_app.dataAccess.abstracts.ProductDao;
import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<Page<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll(Integer categoryId,
                                                                                 Integer subcategoryId,
                                                                                 List<Integer> brandId,
                                                                                 Pageable pageable) {
        return new SuccessDataResult<Page<ProductWithCategoryAndSubcategoryAndBrandDto>>
                (productDao.getAllProductList(categoryId, subcategoryId, brandId, pageable),"Data listelendi");

    }

    @Override
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAllWithoutPages(Integer categoryId,
                                                                                             Integer subcategoryId,
                                                                                             List<Integer> brandId) {
        return new SuccessDataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>>
                (productDao.getAllProductWithoutPages(categoryId, subcategoryId, brandId),"Data listelendi");

    }

    @Override
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAllByName(String categoryName,
                                                                                        String subcategoryName,
                                                                                        List<String> brandName) {
        return new SuccessDataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>>
                (productDao.getAllProductListByName(categoryName, subcategoryName, brandName),"Data listelendi");

    }

    @Override
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByBrand(int brandId) {
        return new SuccessDataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>>
                (productDao.getByBrand(brandId),"Data listelendi");
    }

    @Override
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getByProductName(String productName) {
        return new SuccessDataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>>
                (productDao.getByProductName(productName), "Data Listelendi");
    }

}
