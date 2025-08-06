package com.spring.dependencyinjection.dtos.computerDto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ComputerDto {
    private String brand;
    @Autowired
    private Cpu cpu;

    public ComputerDto(@Value("Asus ROG") String brand, Cpu cpu) {
        this.brand = brand;
        this.cpu = cpu;
    }
}
