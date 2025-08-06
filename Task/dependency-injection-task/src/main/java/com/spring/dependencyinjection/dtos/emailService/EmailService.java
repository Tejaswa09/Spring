package com.spring.dependencyinjection.dtos.emailService;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmailService {
    private String defaultSender;
    @Autowired
    private SmtpSettings smtpSettings; // Dependency

    @Autowired
    public EmailService(@Value("no-reply@example.com") String defaultSender, SmtpSettings smtpSettings) {
        this.defaultSender = defaultSender;
        this.smtpSettings = smtpSettings;
    }
}
