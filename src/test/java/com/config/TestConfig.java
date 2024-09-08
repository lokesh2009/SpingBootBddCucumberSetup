package com.config;

import org.springframework.context.annotation.Bean;
import com.context.TestContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class TestConfig {

    @Bean
    public TestContext testContext() {
        return new TestContext();
    }
}
