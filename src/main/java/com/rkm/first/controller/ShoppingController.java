package com.rkm.first.controller;

import com.rkm.first.model.Shop;
import com.rkm.first.service.ShoppingService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShoppingController {

    Logger logging=Logger.getLogger(ShoppingController.class);

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping
    @RequestMapping(path="/{id}")
    public Shop getData(@PathVariable("id") int id){
        logging.info("Logging Successful");
        return shoppingService.getShopDetails(id);
    }

    @GetMapping
    public Iterator<Shop> getAllData(){
        logging.info("Logging Successful");
        return shoppingService.getAllShopDetails();
    }

    @PostMapping
    public String addData(@Valid @RequestBody Shop shop){
        try {
            shoppingService.addShopDetails(shop);
        }catch(Exception e){
            e.printStackTrace();
            return "Error Please check";
        }
        return "Record added";
    }

    @PostMapping
    @RequestMapping(path = "/addFull")
    public String addAllData(@Valid @RequestBody List<Shop> shopList){
        try {
            shoppingService.addAllShopDetails(shopList);
        }catch(Exception e){
            e.printStackTrace();
            return "Error Please check";
        }
        return "All Record added";
    }

    @DeleteMapping
    @RequestMapping(path = "/delete/{id}")
    public String deleteData(@PathVariable("id") int id){
        try {
            shoppingService.deleteShopDetails(id);
        }catch(Exception e){
            e.printStackTrace();
            return "Error Please check";
        }
        return "record deleted";
    }

    @DeleteMapping
    @RequestMapping(path = "/delete")
    public String deleteAllData(){
        try {
            shoppingService.deleteAllShopDetails();
        }catch(Exception e){
            e.printStackTrace();
            return "Error Please check";
        }
        return "All Records Deleted";
    }

    @PutMapping
    @RequestMapping(path = "/modify")
    public String modifyData(@Valid @RequestBody Shop shop){
        shoppingService.modifyShopDetails(shop);
        return "Record updated";
    }


}
