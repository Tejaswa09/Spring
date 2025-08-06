package com.spring.dependencyinjection.dtos.hospitalDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class HospitalDto {
    private String hospitalName;
    private String specialistFor;
    @Autowired
    private Doctors doctors;

    @Autowired
    public HospitalDto (@Value("ESI") String hospitalName, @Value("Heart") String specialistFor, Doctors doctors){
        this.hospitalName = hospitalName;
        this.specialistFor = specialistFor;
        this.doctors = doctors;
    }


}
