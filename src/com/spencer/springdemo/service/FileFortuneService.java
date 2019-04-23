package com.spencer.springdemo.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService {

    // == fields ==
    private ArrayList<String> fortuneOneLiners;
    private String filename = "C:/code/JavaCourse/spring-demo-annotations/src/fortune.txt";
    private Random random = new Random();

    // == constructor ==
    public FileFortuneService() {}

    @PostConstruct
    void readfortunesFromFile() {

        System.out.println(">> Inside postConstruct of FilefortuneService class");
        // create a File object
        File file = new File(filename);

        // initialise the list
        fortuneOneLiners = new ArrayList<>();

        // use scanner to read file
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                fortuneOneLiners.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortuneOneLiners.size());
        return fortuneOneLiners.get(index);
    }
}
