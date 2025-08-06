package com.spring.dependencyinjection.dtos.computerDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Cpu {
    private  String model;
    private  int coreCount;

    public Cpu(@Value("AMD Ryzen 9") String model, @Value("12") int coreCount) {
        this.model = model;
        this.coreCount = coreCount;
    }
}
