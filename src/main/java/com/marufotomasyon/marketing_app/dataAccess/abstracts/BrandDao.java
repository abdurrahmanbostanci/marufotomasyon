package com.marufotomasyon.marketing_app.dataAccess.abstracts;

import com.marufotomasyon.marketing_app.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDao extends JpaRepository<Brand,Integer> {

    Brand getByBrandName (String brandName);

}
