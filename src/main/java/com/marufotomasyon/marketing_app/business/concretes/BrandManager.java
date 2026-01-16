package com.marufotomasyon.marketing_app.business.concretes;

import com.marufotomasyon.marketing_app.business.abstracts.BrandService;
import com.marufotomasyon.marketing_app.core.results.DataResult;
import com.marufotomasyon.marketing_app.core.results.SuccessDataResult;
import com.marufotomasyon.marketing_app.dataAccess.abstracts.BrandDao;
import com.marufotomasyon.marketing_app.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandManager implements BrandService {

    private BrandDao brandDao;

    @Autowired
    public BrandManager(BrandDao brandDao) {
        super();
        this.brandDao = brandDao;
    }

    @Override
    public DataResult<Brand> getByBrandName (String brandName) {
        return new SuccessDataResult<Brand>
                (this.brandDao.getByBrandName(brandName),"Data Listelendi");
    }

}
