package com.spring.dependencyinjection.dtos.book;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Author {
    private String authorName;
    private String nationality;

    @Autowired
    public Author(@Value("R. K. Narayan") String authorName, @Value("Indian") String nationality) {
        this.authorName = authorName;
        this.nationality = nationality;
    }
}
