package com.spring.dependencyinjection.dtos.music;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AudioCodec {
    private String formatName;
    private int bitrateKbps;

    @Autowired
    public AudioCodec(@Value("FLAC") String formatName, @Value("1411") int bitrateKbps) {
        this.formatName = formatName;
        this.bitrateKbps = bitrateKbps;
    }
}
