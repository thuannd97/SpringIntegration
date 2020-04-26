package com.thuannd.integrationdemo.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway
public interface CustomerGateway {

    @Gateway(requestChannel = "customer-get-score-output-channel")
    Integer getCustomerScore(String name);

}