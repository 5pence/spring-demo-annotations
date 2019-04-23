package com.spencer.springdemo.config;

import com.spencer.springdemo.core.Coach;
import com.spencer.springdemo.core.DartsCoach;
import com.spencer.springdemo.service.FortuneService;
import com.spencer.springdemo.service.LoveFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DartsConfig {

    @Bean
    public FortuneService loveFortuneService() {
        return new LoveFortuneService();
    }

    @Bean
    public Coach dartsCoach() {
        DartsCoach dartsCoach = new DartsCoach(loveFortuneService());
        return dartsCoach;
    }

}
