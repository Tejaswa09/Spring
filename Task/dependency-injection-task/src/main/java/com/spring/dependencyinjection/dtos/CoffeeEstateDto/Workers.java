package com.spring.dependencyinjection.dtos.CoffeeEstateDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Workers {

    private String fName;

    private String lName;

    @Autowired
    public Workers(@Value("Tejaswa")String fName, @Value("D")String lName) {
        this.fName = fName;
        this.lName = lName;
    }

}
