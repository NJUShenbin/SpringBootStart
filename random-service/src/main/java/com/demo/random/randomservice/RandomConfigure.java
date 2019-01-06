package com.demo.random.randomservice;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(RandomProperties.class)
public class RandomConfigure {

    @Bean
    public RandomAlgo randomAlgo(RandomProperties properties){
        BuildInRandomAlgo randomAlgo = new BuildInRandomAlgo(properties.getUpBound());
        return randomAlgo;
    }

}
