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
@Table(name = "subcategories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Subcategory {

    @Id
    @Column(name = "subcategory_id")
    private int subcategoryId;

    @Column(name = "subcategory_name")
    private String subcategoryName;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "subcategory")
    private List<Product> product;

}
