package com.spring.dependencyinjection.dtos.restorant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class RestorentDto {
    private  String hotelName;
    private String hotelAddress;
    @Autowired
    private Menu menu;

    @Autowired
    public RestorentDto(@Value("Spring") String hotelName, @Value("Bangalore") String hotelAddress, Menu menu){
        this.hotelName = hotelName;
        this.hotelAddress= hotelAddress;
        this.menu = menu;

    }

}
