package com.example.library;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")  
public class DevDatabaseConfig implements DatabaseConfig {

    public DevDatabaseConfig() {
        setup();
    }

    @Override
    public void setup() {
        System.out.println("Using In-Memory H2 Database for Development...");
    }
}
