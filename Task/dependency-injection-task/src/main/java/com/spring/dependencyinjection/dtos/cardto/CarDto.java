package com.spring.dependencyinjection.dtos.cardto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class CarDto {
    private String model;
    @Autowired
    private Engine engine;

    @Autowired
    public CarDto(@Value("Ford Mustang") String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
}
