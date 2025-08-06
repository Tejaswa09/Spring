package com.spring.dependencyinjection.dtos.instutedto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class InstituteDto {

    private String institueName;

    private String instituteAddress;
    @Autowired
    private Trainer trainer;

    @Autowired
    public InstituteDto(@Value("X-Workz")String institueName,@Value("RajajiNagar")String instituteAddress,Trainer trainer){
        this.institueName = institueName;
        this.instituteAddress = instituteAddress;
        this.trainer = trainer;
    }
}
