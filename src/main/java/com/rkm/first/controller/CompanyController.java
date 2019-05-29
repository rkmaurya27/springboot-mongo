package com.rkm.first.controller;

import com.rkm.first.model.Company;
import com.rkm.first.service.CompanyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Description("A controller for handling requests for hello messages")
@RequestMapping(path = "/company")
public class CompanyController {
    private Logger logging=Logger.getLogger(CompanyController.class);

    @Autowired
    private CompanyService companyService;

    @GetMapping
    @RequestMapping(path="/{id}")
    public Company getData(@PathVariable("id") Integer id){
        logging.info("Getting details based on id: "+id);
        return companyService.getCompanyDetails(id);
    }

  /*  @GetMapping
    @RequestParam()
    @RequestMapping(path = "/")*/

    @PostMapping
    public String addData(@Valid @RequestBody Company company){
        try {
            companyService.addShopDetails(company);
            logging.info("Adding company details");
        }catch(Exception e){
            return "Error Please check";
        }
        return "Record added";
    }
}
