package com.rkm.first.service;

import com.rkm.first.dao.CompanyDao;
import com.rkm.first.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    public Company getCompanyDetails(int id) {
        return companyDao.findById(id).get();
    }

    public void addShopDetails(Company company){
        companyDao.save(company);
    }
}
