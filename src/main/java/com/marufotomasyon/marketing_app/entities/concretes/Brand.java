package com.marufotomasyon.marketing_app.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brands")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Brand {

    @Id
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "origin_country")
    private String originCountry;


    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "brand_logo_url")
    private String brandLogoUrl;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;
}
