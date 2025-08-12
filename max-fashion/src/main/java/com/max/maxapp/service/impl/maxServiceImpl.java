package com.max.maxapp.service.impl;

import com.max.maxapp.dto.UserDto;
import com.max.maxapp.repository.MaxRepository;
import com.max.maxapp.service.MaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class maxServiceImpl implements MaxService {
    @Autowired
    MaxRepository repo;

    @Override
    public boolean validate(UserDto dto) {

        boolean isSaved=false ;

        if (repo.save(dto)){
            isSaved =true;
        }

        return isSaved;

    }
}
