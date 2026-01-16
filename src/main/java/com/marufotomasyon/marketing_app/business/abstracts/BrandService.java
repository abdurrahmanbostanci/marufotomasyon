package com.marufotomasyon.marketing_app.business.abstracts;

import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.entities.concretes.Brand;

public interface BrandService {

    DataResult<Brand> getByBrandName (String brandName);

}
