package com.spring.dependencyinjection.dtos.team;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Team {
    private String teamName;
    private Coach coach; // Dependency

    @Autowired
    public Team(@Value("Indian Cricket Team") String teamName, Coach coach) {
        this.teamName = teamName;
        this.coach = coach;
    }
}
