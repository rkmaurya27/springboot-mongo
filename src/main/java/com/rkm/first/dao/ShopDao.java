package com.rkm.first.dao;

import com.rkm.first.model.Shop;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopDao extends MongoRepository<Shop,Integer> {
}
