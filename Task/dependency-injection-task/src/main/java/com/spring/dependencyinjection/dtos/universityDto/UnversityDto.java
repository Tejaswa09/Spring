package com.spring.dependencyinjection.dtos.universityDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class UnversityDto {
    private String universityName;
    @Autowired
    private Library library;

    @Autowired
    public UnversityDto(@Value("Bangalore University") String universityName, Library library) {
        this.universityName = universityName;
        this.library = library;
    }
}
