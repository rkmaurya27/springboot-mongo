package com.rkm.first.dao;

import com.rkm.first.model.Company;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyDao extends MongoRepository<Company, Integer> {
}
