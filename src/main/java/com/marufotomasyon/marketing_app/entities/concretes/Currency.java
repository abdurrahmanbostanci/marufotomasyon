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
@Table(name = "currencies")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Currency {

    @Id
    @Column(name = "currency_id")
    private Integer currencyId;

    @Column(name = "currency_name")
    private String currencyName;

    @Column(name = "currency_symbol")
    private String currencySymbol;

    @Column(name = "abbreviation")
    private String abbreviation;

    @OneToMany(mappedBy = "currency")
    private List<Product> products;
}
