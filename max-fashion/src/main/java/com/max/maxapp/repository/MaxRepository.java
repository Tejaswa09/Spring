package com.max.maxapp.repository;

import com.max.maxapp.dto.UserDto;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public interface MaxRepository {
    boolean save(UserDto dto) ;
}
