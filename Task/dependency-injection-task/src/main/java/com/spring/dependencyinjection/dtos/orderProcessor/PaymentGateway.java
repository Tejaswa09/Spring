package com.spring.dependencyinjection.dtos.orderProcessor;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class PaymentGateway {
    private String providerName;
    private double transactionFee;

    @Autowired
    public PaymentGateway(@Value("Razorpay") String providerName, @Value("1.5") double transactionFee) {
        this.providerName = providerName;
        this.transactionFee = transactionFee;
    }
}
