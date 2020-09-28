package com.ciklum.config;

import com.ciklum.service.GameService;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {
    
    @Bean
    public GameService getGameService() {
        return new GameService();
    }
}