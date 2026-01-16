package com.marufotomasyon.marketing_app.dataAccess.abstracts;

import com.marufotomasyon.marketing_app.entities.concretes.Product;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto;
import com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer>{

    @Query("""
    SELECT new com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto(
        p.id,
        p.productName,
        cat.categoryId,
        cat.categoryName,
        s.subcategoryId,
        s.subcategoryName,
        b.brandId,
        b.brandName,
        cur.currencySymbol,
        cur.abbreviation,
        p.unitPrice,
        p.unitsInStock,
        p.description,
        p.imageUrl
    )
    FROM Product p
    JOIN p.category cat
    JOIN p.subcategory s
    JOIN p.brand b
    JOIN p.currency cur
    WHERE (:categoryId IS NULL OR cat.categoryId = :categoryId)
        AND (:subcategoryId IS NULL OR s.subcategoryId = :subcategoryId)
        AND (:brandId IS NULL OR b.brandId IN :brandId)
    ORDER BY p.id ASC
    """)
    List<ProductWithCategoryAndSubcategoryAndBrandDto> getAllProductList(
            @Param("categoryId") Integer categoryId,
            @Param("subcategoryId") Integer subcategoryId,
            @Param("brandId") List<Integer> brandId
    );

    @Query("""
    SELECT new com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto(
        p.id,
        p.productName,
        cat.categoryId,
        cat.categoryName,
        s.subcategoryId,
        s.subcategoryName,
        b.brandId,
        b.brandName,
        cur.currencySymbol,
        cur.abbreviation,
        p.unitPrice,
        p.unitsInStock,
        p.description,
        p.imageUrl
    )
    FROM Product p
    JOIN p.category cat
    JOIN p.subcategory s
    JOIN p.brand b
    JOIN p.currency cur
    WHERE (:categoryName IS NULL OR cat.categoryName = :categoryName)
        AND (:subcategoryName IS NULL OR s.subcategoryName = :subcategoryName)
        AND (:brandName IS NULL OR b.brandName IN :brandName)
    ORDER BY p.id ASC
    """)
    List<ProductWithCategoryAndSubcategoryAndBrandDto> getAllProductListByName(
            @Param("categoryName") String categoryName,
            @Param("subcategoryName") String subcategoryName,
            @Param("brandName") List<String> brandName
    );

    @Query("""
            SELECT new com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto(
                p.id,
                p.productName,
                cat.categoryId,
                cat.categoryName,
                s.subcategoryId,
                s.subcategoryName,
                b.brandId,
                b.brandName,
                cur.currencySymbol,
                cur.abbreviation,
                p.unitPrice,
                p.unitsInStock,
                p.description,
                p.imageUrl
            )
            FROM Product p
            JOIN p.category cat
            JOIN p.subcategory s
            JOIN p.brand b
            JOIN p.currency cur
            WHERE b.brandId = :brandId
            ORDER BY p.id ASC
            """)
    List<ProductWithCategoryAndSubcategoryAndBrandDto> getByBrand(@Param("brandId") int brandId);

    @Query("""
            SELECT new com.marufotomasyon.marketing_app.entities.dtos.ProductWithCategoryAndSubcategoryAndBrandDto(
                p.id,
                p.productName,
                cat.categoryId,
                cat.categoryName,
                s.subcategoryId,
                s.subcategoryName,
                b.brandId,
                b.brandName,
                cur.currencySymbol,
                cur.abbreviation,
                p.unitPrice,
                p.unitsInStock,
                p.description,
                p.imageUrl
            )
            FROM Product p
            JOIN p.category cat
            JOIN p.subcategory s
            JOIN p.brand b
            JOIN p.currency cur
            WHERE p.productName = :productName
            ORDER BY p.id ASC
            """)
    List<ProductWithCategoryAndSubcategoryAndBrandDto> getByProductName (String productName);
}
