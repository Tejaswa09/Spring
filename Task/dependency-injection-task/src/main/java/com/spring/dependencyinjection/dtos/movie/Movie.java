package com.spring.dependencyinjection.dtos.movie;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Movie {
    private String movieTitle;
    @Autowired
    private Director director; // Dependency
    @Autowired
    public Movie(@Value("RRR") String movieTitle, Director director) {
        this.movieTitle = movieTitle;
        this.director = director;
    }
}
