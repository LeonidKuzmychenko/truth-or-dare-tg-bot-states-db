package com.ltechlab.truthordare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class TruthOrDareTgBotStatesDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(TruthOrDareTgBotStatesDbApplication.class, args);
    }

}
