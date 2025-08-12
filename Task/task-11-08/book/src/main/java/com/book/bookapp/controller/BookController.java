package com.book.bookapp.controller;

import com.book.bookapp.dto.UserDto;
import com.book.bookapp.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class BookController {
    @Autowired
    BookService service;

    @PostMapping("signUp")
    public String save(UserDto dto){
        boolean saved =service.save(dto);
        if (saved) return "response.jsp";

        return "error.jsp";
    }
}
