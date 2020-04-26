package com.thuannd.integrationdemo.services;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @ServiceActivator(inputChannel = "customer-get-score-input-channel", outputChannel = "customer-get-score-output-channel")
    public Integer getCustomerScore(String name){
        return "test".equals(name) ? 10 : 0;
    }

}