package com.spencer.springdemo.config;

import com.spencer.springdemo.core.Coach;
import com.spencer.springdemo.core.SwimCoach;
import com.spencer.springdemo.service.FortuneService;
import com.spencer.springdemo.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spencer.springdemo")
@PropertySource("classpath:com/spencer/springdemo/properties/sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        SwimCoach swimCoach = new SwimCoach(sadFortuneService());
        return swimCoach;
    }
}
