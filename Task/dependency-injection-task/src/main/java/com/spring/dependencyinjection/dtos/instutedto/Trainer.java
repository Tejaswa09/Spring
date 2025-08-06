package com.spring.dependencyinjection.dtos.instutedto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class Trainer {

    private String trainerName;

    private String trainerSubject;

    @Autowired
    public Trainer(@Value("Dev")String trainerName,@Value("Java Fullstack")String trainerSubject){
        this.trainerName = trainerName;
        this.trainerSubject = trainerSubject;
    }

}
