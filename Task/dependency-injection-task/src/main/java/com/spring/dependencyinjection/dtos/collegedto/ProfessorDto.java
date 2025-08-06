package com.spring.dependencyinjection.dtos.collegedto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class ProfessorDto {
    private String professorId;
    private  String professorName;
    @Autowired
    public ProfessorDto (@Value("21CS19") String professorId,@Value("Keerthi") String professorName){
        this.professorId=professorId;
        this.professorName = professorName;
    }


}
