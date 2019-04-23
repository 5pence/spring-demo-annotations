package com.spencer.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of Strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random random = new Random();


    @Override
    public String getFortune() {
        // pick random fortune from the array
        int index = random.nextInt(data.length);
        return data[index];
    }
}
