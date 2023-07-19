package com.aurelo.render.springredisexample;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.data.redis")
@Log4j2
@Data
public class RedisDataConfig {

    String host;
    String port;
    String password;

    @PostConstruct
    void printDataRedisConfig() {
        log.info("data redis config: {}", this);
    }
}
