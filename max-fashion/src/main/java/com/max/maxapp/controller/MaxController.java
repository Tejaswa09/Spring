package com.max.maxapp.controller;

import com.max.maxapp.dto.UserDto;
import com.max.maxapp.service.MaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/")
@Component
public class MaxController {
    @Autowired
    MaxService service;


    @PostMapping("userRegister")
    public String saveUser(UserDto dto){

        service.validate(dto);
        return "response.jsp";
    }
}
