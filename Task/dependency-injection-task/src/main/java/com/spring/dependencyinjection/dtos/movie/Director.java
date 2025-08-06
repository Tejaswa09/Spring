package com.spring.dependencyinjection.dtos.movie;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Director {
    private String name;
    private int moviesDirected;
    @Autowired
    public Director(@Value("S. S. Rajamouli") String name, @Value("12") int moviesDirected) {
        this.name = name;
        this.moviesDirected = moviesDirected;
    }
}
