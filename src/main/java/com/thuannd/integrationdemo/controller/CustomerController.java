package com.thuannd.integrationdemo.controller;

import com.thuannd.integrationdemo.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerGateway customerGateway;

    @GetMapping("/{name}")
    public Integer getCreditScore(@PathVariable("name") String name){
        return customerGateway.getCustomerScore(name);
    }

}