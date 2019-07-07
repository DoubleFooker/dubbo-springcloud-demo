package com.ognice;

import com.ognice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 */
@SpringBootApplication
@Slf4j
public class NacosConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApp.class, args);
    }

    @Reference
    UserService userService;

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            log.info("user {}", userService.login("xxx", "yyy"));
        };
    }
}
