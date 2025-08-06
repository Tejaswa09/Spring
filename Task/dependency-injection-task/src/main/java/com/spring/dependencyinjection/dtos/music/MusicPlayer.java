package com.spring.dependencyinjection.dtos.music;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MusicPlayer {
    private String playerName;
    private AudioCodec defaultCodec; // Dependency

    @Autowired
    public MusicPlayer(@Value("Poweramp") String playerName, AudioCodec defaultCodec) {
        this.playerName = playerName;
        this.defaultCodec = defaultCodec;
    }
}
