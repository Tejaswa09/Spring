package com.spring.dependencyinjection.dtos.orderProcessor;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class OrderProcessor {

    private  boolean isCashOnDeliveryEnabled;
    @Autowired
    private PaymentGateway paymentGateway; // Dependency

    @Autowired
    public OrderProcessor(@Value("true") boolean isCashOnDeliveryEnabled, PaymentGateway paymentGateway) {
        this.isCashOnDeliveryEnabled = isCashOnDeliveryEnabled;
        this.paymentGateway = paymentGateway;
    }
}
