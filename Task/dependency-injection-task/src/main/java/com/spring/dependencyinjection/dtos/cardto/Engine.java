package com.spring.dependencyinjection.dtos.cardto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Engine {
    private String type;
    private double displacementLiters;

    @Autowired
    public Engine(@Value("V8") String type, @Value("5.0") double displacementLiters) {
        this.type = type;
        this.displacementLiters = displacementLiters;
    }
}
