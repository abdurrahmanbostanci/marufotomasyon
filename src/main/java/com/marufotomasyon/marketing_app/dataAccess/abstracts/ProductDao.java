package com.marufotomasyon.marketing_app.dataAccess.abstracts;

import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer>{

    @Query("""
    SELECT new com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto(
        p.id,
        p.productName,
        cat.categoryName,
        s.subcategoryName,
        b.brandName,
        cur.abbreviation,
        p.unitPrice,
        p.unitsInStock
    )
    FROM Product p
    JOIN p.category cat
    JOIN p.subcategory s
    JOIN p.brand b
    JOIN p.currency cur
    """)
    List<ProductWithCategoryAndSubcategoryAndBrandDto> getAllProductList();
}
