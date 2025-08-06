package com.spring.dependencyinjection.dtos.database;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ConnectionPool {
    private int maxConnections;
    private long timeoutMillis;

    @Autowired
    public ConnectionPool(@Value("20") int maxConnections, @Value("30000") long timeoutMillis) {
        this.maxConnections = maxConnections;
        this.timeoutMillis = timeoutMillis;
    }
}
