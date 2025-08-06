package com.spring.dependencyinjection.dtos.hospitalDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Doctors {
    private String doctorName;
    private int doctorExperience;

    @Autowired
    public Doctors(@Value("Tejaswa D") String doctorName, @Value("12") int doctorExperience) {
        this.doctorName = doctorName;
        this.doctorExperience = doctorExperience;
    }
}
