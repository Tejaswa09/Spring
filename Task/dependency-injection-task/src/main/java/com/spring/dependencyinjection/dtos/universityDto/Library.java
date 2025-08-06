package com.spring.dependencyinjection.dtos.universityDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Library {
    private  int bookCount;
    private String librarianName;

    @Autowired
    public Library(@Value("50000") int bookCount, @Value("Dr. Sharma") String librarianName) {
        this.bookCount = bookCount;
        this.librarianName = librarianName;
    }
}
