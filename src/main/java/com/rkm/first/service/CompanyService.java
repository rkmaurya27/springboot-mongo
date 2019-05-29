package com.rkm.first.service;

import com.rkm.first.dao.CompanyDao;
import com.rkm.first.model.Company;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private Logger logging=Logger.getLogger(CompanyService.class);

    @Autowired
    private CompanyDao companyDao;

    public Company getCompanyDetails(Integer id) {
        logging.info("Fetching records with Id: "+id);
        return companyDao.findById(id).get();
    }

    public void addShopDetails(Company company){
        logging.trace("Adding Company details");
        companyDao.save(company);
    }
}
