package com.example.library;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")  
public class ProdDatabaseConfig implements DatabaseConfig {

    public ProdDatabaseConfig() {
        setup();
    }

    @Override
    public void setup() {
        System.out.println("Using MySQL Database for Production...");
    }
}
