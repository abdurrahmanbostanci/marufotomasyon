package com.marufotomasyon.marketing_app.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryAndSubcategoryDto {

    private int id;
    private String productName;
    private String categoryName;
    private String subcategoryName;

}
