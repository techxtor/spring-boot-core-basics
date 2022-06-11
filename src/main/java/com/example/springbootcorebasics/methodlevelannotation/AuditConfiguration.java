package com.example.springbootcorebasics.methodlevelannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditConfiguration {
    @Bean
    public AuditService audit() {
        return new AuditService();
    }
}

class AuditService {
}