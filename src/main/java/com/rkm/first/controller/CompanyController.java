package com.rkm.first.controller;

import com.rkm.first.model.Company;
import com.rkm.first.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    @RequestMapping(path="/{id}")
    public Company getData(@PathVariable("id") int id){
        return companyService.getCompanyDetails(id);
    }

    @PostMapping
    public String addData(@Valid @RequestBody Company company){
        try {
            companyService.addShopDetails(company);
            System.out.println(company.toString());
        }catch(Exception e){
            e.printStackTrace();
            return "Error Please check";
        }
        return "Record added";
    }
}
