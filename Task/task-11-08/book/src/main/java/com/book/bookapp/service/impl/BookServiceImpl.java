package com.book.bookapp.service.impl;

import com.book.bookapp.dto.UserDto;
import com.book.bookapp.respository.BookRespository;
import com.book.bookapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
    @Autowired
            @Qualifier("BookSaveRepo")
    BookRespository rep;

    @Override
    public boolean save(UserDto dto) {
        boolean isSaved= rep.save(dto);
        if (isSaved) return true;
        return false;
    }


}
