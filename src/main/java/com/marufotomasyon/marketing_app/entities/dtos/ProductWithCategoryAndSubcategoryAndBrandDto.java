package com.marufotomasyon.marketing_app.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryAndSubcategoryAndBrandDto {

    private Integer id;
    private String productName;
    private Integer categoryId;
    private String categoryName;
    private Integer subcategoryId;
    private String subcategoryName;
    private Integer brandId;
    private String brandName;
    private String currencySymbol;
    private String abbreviation;
    private double unitPrice;
    private int unitsInStock;
    private String description;
    private String imageUrl;

}
