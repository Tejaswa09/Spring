package com.book.bookapp.respository;

import com.book.bookapp.dto.UserDto;

public interface BookRespository {
    boolean save(UserDto dto);
}
