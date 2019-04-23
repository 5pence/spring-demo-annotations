package com.spencer.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class LoveFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today you will meet someone fabulous, keep smiling";
    }
}
