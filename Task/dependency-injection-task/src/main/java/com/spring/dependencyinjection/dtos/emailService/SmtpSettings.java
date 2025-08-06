package com.spring.dependencyinjection.dtos.emailService;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class SmtpSettings {
    private String host;
    private int port;

    @Autowired
    public SmtpSettings(@Value("smtp.gmail.com") String host, @Value("587") int port) {
        this.host = host;
        this.port = port;
    }
}
