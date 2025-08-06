package com.spring.dependencyinjection.dtos.team;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Coach {
    private final String name;
    private final String specialization;

    @Autowired
    public Coach(@Value("Rahul Dravid") String name, @Value("Batting") String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}
