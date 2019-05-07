package com.rkm.first.service;

import com.rkm.first.dao.ShopDao;
import com.rkm.first.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ShoppingService {

    @Autowired
    private ShopDao shopDao;

    public Shop getShopDetails(int id) {
        return shopDao.findById(id).get();
    }

    public Iterator<Shop> getAllShopDetails() {
        return shopDao.findAll().iterator();
    }

    public void addShopDetails(Shop shop){
        shopDao.save(shop);
    }

    public void addAllShopDetails(List<Shop> shopList){
        shopDao.saveAll(shopList);
    }

    public void deleteShopDetails(int id){
        shopDao.deleteById(id);
    }

    public void deleteAllShopDetails(){
        shopDao.deleteAll();
    }

    public void modifyShopDetails(Shop shop){
        shopDao.save(shop);
    }

}
