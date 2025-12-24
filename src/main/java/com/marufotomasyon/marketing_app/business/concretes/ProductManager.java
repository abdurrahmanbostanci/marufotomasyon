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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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
    public DataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>> getAll() {
        return new SuccessDataResult<List<ProductWithCategoryAndSubcategoryAndBrandDto>>
                (productDao.getAllProductList(),"Data listelendi");

    }

}
