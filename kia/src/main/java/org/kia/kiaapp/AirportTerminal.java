package org.kia.kiaapp;


import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString

public class AirportTerminal {

    private int terminal;

    public AirportTerminal(@Value("2")int terminal){
        System.out.println("AirportTerminal constructor invoked");
        this.terminal = terminal;
    }

}
