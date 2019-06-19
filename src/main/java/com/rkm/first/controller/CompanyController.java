package com.rkm.first.controller;

import com.rkm.first.model.Company;
import com.rkm.first.service.CompanyService;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Description("A controller for handling requests for hello messages")
@RequestMapping(path = "/company")
@Api(value="Employee Management System", description="Operations pertaining to employee in Employee Management System")
public class CompanyController {
    private Logger logging=Logger.getLogger(CompanyController.class);

    @Autowired
    private CompanyService companyService;

    @GetMapping
    @RequestMapping(path="/{id}")
    @ApiOperation(value = "View a list of available employees", response = Company.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })    public Company getData(@PathVariable("id") Integer id){
        logging.info("Getting details based on id: "+id);
        return companyService.getCompanyDetails(id);
    }

  /*  @GetMapping
    @RequestParam()
    @RequestMapping(path = "/")*/

    @PostMapping
    @ApiOperation(value = "Add new employees", response = Company.class)
    public String addData(
            @ApiParam(value = "Employee object store in database table", required = true)@Valid @RequestBody Company company){
        try {
            companyService.addShopDetails(company);
            logging.info("Adding company details");
        }catch(Exception e){
            return "Error Please check";
        }
        return "Record added";
    }
}
