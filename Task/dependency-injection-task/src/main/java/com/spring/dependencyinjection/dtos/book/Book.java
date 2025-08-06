package com.spring.dependencyinjection.dtos.book;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    private String title;
    private Author author;

    @Autowired
    public Book(@Value("Malgudi Days") String title, Author author) {
        this.title = title;
        this.author = author;
    }
}
