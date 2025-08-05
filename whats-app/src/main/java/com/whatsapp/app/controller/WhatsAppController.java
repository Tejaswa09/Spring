package com.whatsapp.app.controller;

import com.whatsapp.app.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class WhatsAppController {

    @PostMapping("/signup")
    public String createUserProfile(UserDto dto, Model model){
        model.addAttribute("fname",dto.getFName());
        return "response.jsp";

    }
}
