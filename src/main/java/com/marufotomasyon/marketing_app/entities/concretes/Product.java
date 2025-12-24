package com.marufotomasyon.marketing_app.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne()
    @JoinColumn(name = "subcategory_id")
    private Subcategory subcategory;

    @ManyToOne()
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne()
    @JoinColumn(name = "currency_id")
    private Currency currency;


}
