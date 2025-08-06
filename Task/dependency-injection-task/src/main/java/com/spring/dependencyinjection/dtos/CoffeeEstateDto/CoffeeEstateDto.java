package com.spring.dependencyinjection.dtos.CoffeeEstateDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class CoffeeEstateDto {

    private String estateName;

    private String estasteLocation;
    @Autowired
    private Workers workers;

    @Autowired
    public CoffeeEstateDto(@Value("Nothing")String estateName,@Value("Chikkamagalore")String estasteLocation,Workers workers){
        this.estateName = estateName;
        this.estasteLocation =estasteLocation;
        this.workers = workers;
    }
}
