package com.marufotomasyon.marketing_app.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryAndSubcategoryAndBrandDto {

    private int id;
    private String productName;
    private String categoryName;
    private String subcategoryName;
    private String brandName;
    private String abbreviation;
    private double unitPrice;
    private int unitsInStock;

}
