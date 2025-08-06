package com.spring.dependencyinjection.dtos.database;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class DatabaseService {
    private String databaseUrl;
    private ConnectionPool connectionPool; // Dependency

    @Autowired
    public DatabaseService(@Value("jdbc:mysql://localhost:3306/prod_db") String databaseUrl, ConnectionPool connectionPool) {
        this.databaseUrl = databaseUrl;
        this.connectionPool = connectionPool;
    }
}
