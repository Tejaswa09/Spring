package com.whatsapp.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserDto {
    private String fName;
    private String lName;
    private String email;
    private String password;
    private String cnfPassword;

}
