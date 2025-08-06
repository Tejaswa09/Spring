package com.spring.dependencyinjection.dtos.restorant;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Menu {
    private int itemId;
    private String itemName;

    @Autowired
    public Menu(@Value("1") int itemId,@Value("Butter Chicken") String itemName){
        this.itemId = itemId ;
        this.itemName = itemName;

    }
}
