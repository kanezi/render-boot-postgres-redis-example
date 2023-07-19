package com.aurelo.render.springredisexample;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "spring.datasource")
@Configuration
@Data
@Log4j2
public class PostgresConfig {

    String url;
    String username;
    String password;

    @PostConstruct
    void printDbProperties() {
        log.info("DB properties: {}", this);
    }

}
