package com.spring.dependencyinjection.dtos.collegedto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component

public class CollegeDto {
    private String collageName;
    private String address;
    @Autowired
    private ProfessorDto professor;

    @Autowired
    public CollegeDto (@Value("AIT") String collageName,@Value("Chikkamagalore") String address, ProfessorDto professor){
        this.collageName = collageName;
        this.address = address;
        this.professor = professor;
    }


}
